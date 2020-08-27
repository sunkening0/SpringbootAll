package com.keelin.mapper;

import com.keelin.model.Permission;
import com.keelin.model.dto.PermissionDto;
import com.keelin.model.dto.RoleDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PermissionMapper extends Mapper<PermissionDto> {

    List<PermissionDto> findPermissionByRole(RoleDto roleDto);

}