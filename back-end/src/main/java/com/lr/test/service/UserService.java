package com.lr.test.service;

import com.github.pagehelper.Page;
import com.lr.test.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author kenny.cai
 */
@Service
public interface UserService {
    User selectByPrimaryKey (String id);

    void updateByPrimaryKeySelective(User user);

    void insert(User user);

    Page<User> findPage (User user);

    long count (User user);
}
