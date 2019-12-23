package com.lr.test.dao.ext;

import com.lr.test.dao.UserDao;
import com.lr.test.entity.User;
import com.lr.test.entity.ext.UserExt;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@WebAppConfiguration
@Slf4j
@Rollback
@Transactional
public class UserExtDaoTest {
    private static final String id = "12345678";
    private static final String name = "test";

    @Autowired
    private UserExtDao userExtDao;

    @Autowired
    private UserDao userDao;

    @BeforeEach
    void setUp() {
        User user = User.builder()
                .id(id)
                .name(name)
                .build();
        userDao.insert(user);
    }

    @Test
    void getUser() {
        UserExt getUser = userExtDao.selectExtByPrimaryKey(id);
        log.info(getUser.toString());
    }
}
