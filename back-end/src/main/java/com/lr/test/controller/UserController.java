package com.lr.test.controller;

import com.lr.test.controller.base.BaseController;
import com.lr.test.dao.ext.UserExtDao;
import com.lr.test.dto.ResultBody;
import com.lr.test.entity.ext.UserExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kenny.cai
 */
@RestController
@RequestMapping("/api")
public class UserController extends BaseController {

    @Autowired
    UserExtDao userExtDao;

    @GetMapping(value = "/user")
    public ResultBody getUser (UserExt user) {
        return ResultBody.success(userExtDao.selectExtByPrimaryKey("d"));
    }
}
