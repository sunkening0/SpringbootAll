package com.keelin.mapper;

import com.keelin.model.Role;
import com.keelin.model.dto.RoleDto;
import com.keelin.model.dto.UserDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface RoleMapper extends Mapper<RoleDto> {

    List<RoleDto> findRoleByUser(UserDto userDto);

}