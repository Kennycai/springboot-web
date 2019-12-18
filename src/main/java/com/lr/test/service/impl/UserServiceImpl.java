package com.lr.test.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lr.test.dao.UserDao;
import com.lr.test.entity.User;
import com.lr.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author kenny.cai
 */
@Service
public class UserServiceImpl implements UserService, Serializable {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectByPrimaryKey(String id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public Page<User> findPage(User user) {
        return PageHelper.startPage(1, 10).doSelectPage(() -> userDao.select(user));
    }

    @Override
    public long count(User user) {
        return PageHelper.count(() -> userDao.select(user));
    }
}
