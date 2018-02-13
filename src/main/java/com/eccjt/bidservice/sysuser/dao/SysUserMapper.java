package com.eccjt.bidservice.sysuser.dao;

import com.eccjt.bidservice.sysuser.model.SysUser;
import com.eccjt.bidservice.sysuser.model.SysUserExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    //新增用户角色关系
    void addLationRoles(String userId,List<String> roleIds);
    //删除用户角色关系
    void deleteLationRoles(String userId,List<String> roleIds);
    //根据用户名寻找角色
    Set<String> findRoles(String username);
    //根据用户名寻找权限
    Set<String> findPermissions(String username);

    

}