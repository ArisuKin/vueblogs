package com.klins.oc.blog.vueblogs.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * &#064;program vueblogs
 * &#064;packing com.klins.oc.blog.vueblogs.shiro
 *
 * @author Klins
 * &#064;date 2022年06月20日 15:39
 * &#064;description 一个新的类或服务
 */
public class JwtToken implements AuthenticationToken {

    private final String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}
