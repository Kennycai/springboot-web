package com.lr.test.service;

import com.github.pagehelper.Page;
import com.lr.test.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@WebAppConfiguration
@Slf4j
@Rollback
@Transactional
class UserServiceTest {
    @Autowired
    private UserService userService;

    private static final String id = "12345678";
    private static final String name = "test";

    @BeforeEach
    void setUp() {
        User user = User.builder()
                .id(id)
                .name(name)
                .build();
        userService.insert(user);
    }

    @Test
    void getUser() {
        User getUser = userService.selectByPrimaryKey(id);
        log.info(getUser.toString());
        assertThat(getUser.getName()).isEqualTo(name);
    }

    @Test
    void update() {
        User user = User.builder().id(id).name("update").build();
        userService.updateByPrimaryKeySelective(user);
        assertThat(userService.selectByPrimaryKey(id).getName()).isEqualTo("update");
    }

    @Test
    void findPage() {
        User user = User.builder().build();
        Page<User> page = userService.findPage(user);
        assertThat(Arrays.equals(page.stream().map(User::getName).toArray(String[]::new), new String[]{name})).isEqualTo(true);
    }

    @Test
    void count() {
        User user = User.builder().build();
        assertThat(userService.count(user)).isEqualTo(1L);
    }
}
