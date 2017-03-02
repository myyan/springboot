package com.example.controller;

import com.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by heiqie on 2017/3/2.
 */
@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/")
    @ResponseBody
    public User home() {
        User user = new User();
        user.setId(1);
        user.setName("user");
        user.setAge(12);
        log.info("user :{}", user);
        return user;
    }
}
