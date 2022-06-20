package com.klins.oc.blog.vueblogs.utils;


import io.jsonwebtoken.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * &#064;program vueblogs
 * &#064;packing com.klins.oc.blog.vueblogs.utils
 *
 * @author Klins
 * &#064;date 2022年06月20日 15:41
 * &#064;description 一个新的类或服务
 */
@Slf4j
@Data
@Component
//@ConfigurationProperties(prefix = "com.klins.oc.blog.vueblogs.jwt")
@ConfigurationProperties(prefix = "markerhub.jwt")
public class JwtUtils {
    private String secret;
    private long expire;
    private String header;
    /**
     * 生成jwt token
     */
    public String generateToken(long userId) {
    //...
        Date now = new Date();
        Date expireDate = new Date(now.getTime() + expire * 1000);

        return Jwts.builder().setSubject(userId+ "").setIssuedAt(now).setExpiration(expireDate).signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    // 获取jwt的信息
    public Claims getClaimByToken(String token) {
    //...
        try {
            return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
            //} catch (ExpiredJwtException | UnsupportedJwtException | MalformedJwtException | SignatureException |
            //         IllegalArgumentException e) {
            //    throw new RuntimeException(e);
        }catch (Exception e){
            log.debug("validate is token error", e);
            return null;
        }
    }

    /**
     * token是否过期
     * @return  true：过期
     */
    public boolean isTokenExpired(Date expiration) {
        return expiration.before(new Date());
    }
}
