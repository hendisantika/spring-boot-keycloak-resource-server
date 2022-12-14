package com.hendisantika;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak-resource-server
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/11/22
 * Time: 08:40
 * To change this template use File | Settings | File Templates.
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/")
    public String test() {
        log.info("Spring Boot Keycloak Resource Server Sample " + LocalDateTime.now());
        return "Spring Boot Keycloak Resource Server Sample  " + LocalDateTime.now();
    }

    @GetMapping("/test1")
    public String test2() {
        log.info("Spring Boot Keycloak Resource Server Sample 1 " + LocalDateTime.now());
        return "Spring Boot Keycloak Resource Server Sample 1 " + LocalDateTime.now();
    }
}
