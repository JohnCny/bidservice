package com.eccjt.bidservice.conf.shiro;

import org.apache.shiro.authc.AuthenticationException;

public class CasAuthenticationException extends AuthenticationException {

    public CasAuthenticationException() {
        super();
    }

    public CasAuthenticationException(String message) {
        super(message);
    }

    public CasAuthenticationException(Throwable cause) {
        super(cause);
    }

    public CasAuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
