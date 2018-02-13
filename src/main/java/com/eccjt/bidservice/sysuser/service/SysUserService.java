package com.eccjt.bidservice.sysuser.service;

import com.eccjt.bidservice.sysrole.model.SysRole;
import com.eccjt.bidservice.sysuser.model.SysUser;

import java.util.List;

public interface SysUserService {

    /**
     * 根据用户名称寻找用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);

    /**
     * 获得用户角色列表
     * @param userId
     * @return
     */
    List<SysRole> getRoleList(String userId);
}
