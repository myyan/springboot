package com.example.service;

import com.example.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by heiqie on 2017/3/2.
 */
@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser() {
        User user = new User();
        user.setAge(12);
        user.setName("sad");
        log.info("user:{}", user);
    }
}
