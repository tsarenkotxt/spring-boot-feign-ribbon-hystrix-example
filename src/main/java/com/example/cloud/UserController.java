package com.example.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple user controller
 */
@Slf4j
@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        User user = new User("Alex");
        log.info("Get user: {}", user);
        return user;
    }

}
