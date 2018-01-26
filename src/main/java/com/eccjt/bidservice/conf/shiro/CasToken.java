package com.eccjt.bidservice.conf.shiro;

import org.apache.shiro.authc.RememberMeAuthenticationToken;

public class CasToken implements RememberMeAuthenticationToken {

    // the service ticket returned by the CAS server
    private String ticket = null;

    // the user identifier
    private String userId = null;

    // is the user in a remember me mode ?
    private boolean isRememberMe = false;

    public CasToken(String ticket) {
        this.ticket = ticket;
    }

    public Object getPrincipal() {
        return userId;
    }

    public Object getCredentials() {
        return ticket;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isRememberMe() {
        return isRememberMe;
    }

    public void setRememberMe(boolean isRememberMe) {
        this.isRememberMe = isRememberMe;
    }
}
