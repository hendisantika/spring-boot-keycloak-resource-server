package com.hendisantika.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak-resource-server
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/13/22
 * Time: 16:58
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/test1").permitAll();
//        return http.build();
//    }

//    @Bean
//    SecurityFilterChain resources(HttpSecurity http) throws Exception {
//        http
//                .requestMatchers((matchers) -> matchers.antMatchers("/test1/**"))
//                .authorizeHttpRequests((authorize) -> authorize.anyRequest().permitAll())
//                .requestCache().disable()
//                .securityContext().disable()
//                .sessionManagement().disable();
//
//        return http.build();
//    }

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring().antMatchers( "/test1");
//    }
}
