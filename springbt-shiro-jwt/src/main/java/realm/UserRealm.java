package realm;

import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import mapper.PermissionMapper;
import mapper.RoleMapper;
import mapper.UserMapper;
import model.User;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import utils.JwtUtil;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        // 解密获得account，用于和数据库进行对比
        String account = jwtUtil.getClaim(token, "account");
        // 帐号为空
        if (StringUtils.isEmpty(account)) {
            throw new AuthenticationException("Token中帐号为空(The account in Token is empty.)");
        }
        // 查询用户是否存在
        User user = new User();
        user.setAccount(account);
        user = userMapper.selectOne(user);
        if (user == null) {
            throw new AuthenticationException("该帐号不存在(The account does not exist.)");
        }
        // 开始认证
        if (jwtUtil.verify(token)) {
            //认证通过  校验是否过期
            if(jwtUtil.isTokenExpired(token)){ //已过期
                throw new TokenExpiredException("token已过期");
            }
            return new SimpleAuthenticationInfo(token, token, "userRealm");
        }else{
            throw new AuthenticationException("Token incorrect");
        }
    }
}
