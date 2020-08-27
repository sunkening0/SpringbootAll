package com.keelin.service.impl;

import com.keelin.mapper.UserMapper;
import com.keelin.model.dto.UserDto;
import com.keelin.service.IUserService;
import com.keelin.utils.SpringUtil;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 *
 * @author dolyw.com
 * @date 2018/8/9 15:45
 */
@Service
@DependsOn("springUtil")
public class UserServiceImpl extends BaseServiceImpl<UserDto> implements IUserService {
    public UserServiceImpl(){
        super.mapper = SpringUtil.getObject(UserMapper.class);
    }
}
