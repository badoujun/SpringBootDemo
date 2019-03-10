package com.web.demo.service.impl;

import com.web.demo.dao.UserDao;
import com.web.demo.pojo.User;
import com.web.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<User> select() {
        return userDao.select();
    }
}
