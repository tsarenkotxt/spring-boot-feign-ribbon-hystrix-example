package com.example.cloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign client with ribbon and hystrix
 */
@RibbonClient(value = "user-client") // load balancer
@FeignClient(value = "user-client", fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping("/user")
    User getUser();

}
