package com.eccjt.shiro.general;

import com.eccjt.bidservice.sysrole.model.SysRole;
import com.eccjt.bidservice.sysuser.model.SysUser;
import com.eccjt.bidservice.sysuser.service.SysUserService;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;

import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class GeneralRealm extends AuthorizingRealm{
    private static final Logger logger = LoggerFactory.getLogger(GeneralRealm.class);

    @Resource
    SysUserService sysUserService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("GeneralRealm.doGetAuthenticationInfo(token)");
        //获取用户的输入的账号.
        String username = (String)authenticationToken.getPrincipal();
        logger.debug((String)authenticationToken.getCredentials());
        //通过username从数据库中查找User对象
        SysUser sysUser = sysUserService.findByUsername(username);
        logger.debug("----->>userInfo="+sysUser);
        if(sysUser == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                sysUser, //用户名
                sysUser.getPassword(), //密码
                ByteSource.Util.bytes(sysUser.getSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("GeneralRealm.doGetAuthenticationInfo(principal)");

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        SysUser sysUser=(SysUser)principalCollection.getPrimaryPrincipal();

        for(SysRole role:sysUserService.getRoleList(sysUser.getId())){
            authorizationInfo.addRole(role.getRoleName());
            //获取权限，暂不到这个粒度
//            for(SysPermission p:role.getPermissions()){
//                authorizationInfo.addStringPermission(p.getPermission());
//            }
        }
        return authorizationInfo;
    }


}
