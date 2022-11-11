package com.hendisantika;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class TestController {

    @GetMapping("/")
    public String test() {
        return "success";
    }
}
