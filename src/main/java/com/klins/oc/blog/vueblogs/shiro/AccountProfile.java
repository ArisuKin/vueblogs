package com.klins.oc.blog.vueblogs.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * &#064;program vueblogs
 * &#064;packing com.klins.oc.blog.vueblogs.shiro
 *
 * @author Klins
 * &#064;date 2022年06月20日 15:44
 * &#064;description 一个新的类或服务
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
