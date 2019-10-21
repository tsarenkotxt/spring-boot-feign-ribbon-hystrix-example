package com.example.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Fallback feign client for user-client
 */
@Slf4j
@Component
public class UserClientFallback implements UserClient {

    @Override
    public User getUser() {
        User user = new User("fallback");
        log.info("Get fallback user: {}", user);
        return user;
    }

}
