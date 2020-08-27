package utils;

import exception.CustomException;
import mapper.UserMapper;
import model.User;
import model.dto.UserDto;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取当前登录用户工具类
 */
@Component
public class UserUtil {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private JwtUtil jwtUtil;

    /**
     * 获取当前登录用户
     */
    public User getUser() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        String account = jwtUtil.getClaim(token, "account");
        User user = new UserDto();
        user.setAccount(account);
        user = userMapper.selectOne(user);
        // 用户是否存在
        if (user == null) {
            throw new CustomException("该帐号不存在(The account does not exist.)");
        }
        return user;
    }

    /**
     * 获取当前登录用户Id
     */
    public Integer getUserId() {
        return getUser().getId();
    }

    /**
     * 获取当前登录用户Token
     */
    public String getToken() {
        return SecurityUtils.getSubject().getPrincipal().toString();
    }

    /**
     * 获取当前登录用户Account
     */
    public String getAccount() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        return jwtUtil.getClaim(token, "account");
    }
}
