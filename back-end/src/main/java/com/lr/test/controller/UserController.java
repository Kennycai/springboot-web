package com.lr.test.controller;

import com.lr.test.controller.base.BaseController;
import com.lr.test.entity.User;
import com.lr.test.exception.BizException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kenny.cai
 */
@RestController
@RequestMapping("/api")
public class UserController extends BaseController {

    @GetMapping(value = "/user")
    public User getUser (User user) {
        throw new BizException("-1", "asd");
    }
}
