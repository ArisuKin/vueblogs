package com.klins.oc.blog.vueblogs.service.impl;

import com.klins.oc.blog.vueblogs.entity.Blog;
import com.klins.oc.blog.vueblogs.mapper.BlogMapper;
import com.klins.oc.blog.vueblogs.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author KLins
 * @since 2022-06-18
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
