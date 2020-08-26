package utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {
    /**
     * logger
     */
    private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

    /**
     * 过期时间改为从配置文件获取
     */
    private static String accessTokenExpireTime;

    /**
     * JWT认证加密私钥(Base64加密)
     */
    private static String encryptJWTKey;

    @Value("${accessTokenExpireTime}")
    public void setAccessTokenExpireTime(String accessTokenExpireTime) {
        JwtUtil.accessTokenExpireTime = accessTokenExpireTime;
    }

    @Value("${encryptJWTKey}")
    public void setEncryptJWTKey(String encryptJWTKey) {
        JwtUtil.encryptJWTKey = encryptJWTKey;
    }

    /**
     * 校验token是否正确
     */
    public static boolean verify(String token) {
        try {
            // 帐号加JWT私钥解密
            String secret = getClaim(token, "account") + Base64ConvertUtil.decode(encryptJWTKey);
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(token);
            return true;
        } catch (UnsupportedEncodingException e) {
            logger.error("JWTToken认证解密出现UnsupportedEncodingException异常:{}", e.getMessage());
            throw new CustomException("JWTToken认证解密出现UnsupportedEncodingException异常:" + e.getMessage());
        }
    }

    /**
     * 获得Token中的信息无需secret解密也能获得
     */
    public static String getClaim(String token, String claim) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            // 只能输出String类型，如果是其他类型返回null
            return jwt.getClaim(claim).asString();
        } catch (JWTDecodeException e) {
            logger.error("解密Token中的公共信息出现JWTDecodeException异常:{}", e.getMessage());
            throw new CustomException("解密Token中的公共信息出现JWTDecodeException异常:" + e.getMessage());
        }
    }

    /**
     * 生成签名
     */
    public static String sign(String account, String currentTimeMillis) {
        try {
            // 帐号加JWT私钥加密
            String secret = account + Base64ConvertUtil.decode(encryptJWTKey);
            // 此处过期时间是以毫秒为单位，所以乘以1000
            Date date = new Date(System.currentTimeMillis() + Long.parseLong(accessTokenExpireTime) * 1000);
            Algorithm algorithm = Algorithm.HMAC256(secret);

            // 附带account帐号信息
            return JWT.create()
                    .withClaim("account", account)
                    .withClaim("currentTimeMillis", currentTimeMillis)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            logger.error("JWTToken加密出现UnsupportedEncodingException异常:{}", e.getMessage());
            throw new CustomException("JWTToken加密出现UnsupportedEncodingException异常:" + e.getMessage());
        }
    }

    /**
     * 刷新token
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            //final DecodedJWT decodedJWT = getClaimsFromToken(token);
            String account = getUsernameFromToken(token);
            //claims.put(CLAIM_KEY_CREATED, new Date());
            refreshedToken = sign(account,new Date().getTime()+"");
        } catch (Exception e) {
            refreshedToken = null;
        }
        return refreshedToken;
    }

    public String getUsernameFromToken(String token) {
        String username;
        try {
            final DecodedJWT claims = getClaimsFromToken(token);
            //Claim claim = claims.get("account");
            //username = claims.getSubject();
            username = claims.getClaim("account").asString();
        } catch (Exception e) {
            username = null;
        }
        return username;
    }

    public Date getCreatedDateFromToken(String token) {
        Date created;
        try {
            final DecodedJWT claims = getClaimsFromToken(token);
            //created = new Date((Long) claims.get(CLAIM_KEY_CREATED));
            created = new Date(Long.parseLong(claims.getClaim("currentTimeMillis").asString()));
        } catch (Exception e) {
            created = null;
        }
        return created;
    }

    public Date getExpirationDateFromToken(String token) {
        Date expiration;
        try {
            final DecodedJWT claims = getClaimsFromToken(token);
            //expiration = claims.getExpiration();
            expiration = claims.getExpiresAt();
        } catch (Exception e) {
            expiration = null;
        }
        return expiration;
    }

    private DecodedJWT getClaimsFromToken(String token) {
        //Map<String,Claim> claims;
        DecodedJWT decodedJWT;
        try {
            decodedJWT = JWT.decode(token);
            //claims = decodedJWT.get
        /*Jwts.parser()
                    .setSigningKey( Const.SECRET )
                    .parseClaimsJws(token)
                    .getBody();*/
        } catch (Exception e) {
            decodedJWT = null;
        }
        return decodedJWT;
    }

    /**
     * 判断token是否过期
     * @param token
     * @return
     */
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }


}
