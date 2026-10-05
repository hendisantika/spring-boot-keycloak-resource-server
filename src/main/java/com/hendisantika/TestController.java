package com.hendisantika;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

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

    @GetMapping("/test2")
    public String test() {
        log.info("Spring Boot Keycloak Resource Server Sample " + LocalDateTime.now());
        return "Spring Boot Keycloak Resource Server Sample  " + LocalDateTime.now();
    }

    @GetMapping("/test1")
    public String test2() {
        log.info("Spring Boot Keycloak Resource Server Sample 1 " + LocalDateTime.now());
        return "Spring Boot Keycloak Resource Server Sample 1 " + LocalDateTime.now();
    }

    /// how to get jwt details ????? (token claims)
    @GetMapping("/details")
    public Map<String, Object> getUserDetails(@AuthenticationPrincipal Jwt jwt) {
        return Map.of(
                "subject", jwt.getSubject(),
                "username", jwt.getClaimAsString("preferred_username"),
                "email", jwt.getClaimAsString("email"),
                "firstName", jwt.getClaimAsString("given_name"),
                "lastName", jwt.getClaimAsString("family_name")
        );
    }
}
