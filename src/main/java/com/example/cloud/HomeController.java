package com.example.cloud;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller, triggers feign client
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {

    private final UserClient userClient;

    @GetMapping
    public User home() {
        User user = userClient.getUser();
        log.info("Received user: {}", user);
        return user;
    }

}
