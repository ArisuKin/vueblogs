package com.klins.oc.blog.vueblogs.cfg;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * &#064;program vueblogs
 * &#064;packing com.klins.oc.blog.vueblogs.cfg
 *
 * @author Klins
 * &#064;date 2022年06月17日 23:52
 * &#064;description MyBatis 配置文件
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.klins.oc.blog.vueblogs.mapper")
public class MyBatisPlusConfig {
//    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
        return interceptor;
    }

}
