package com.klins.oc.blog.vueblogs.service.impl;

import com.klins.oc.blog.vueblogs.entity.User;
import com.klins.oc.blog.vueblogs.mapper.UserMapper;
import com.klins.oc.blog.vueblogs.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
