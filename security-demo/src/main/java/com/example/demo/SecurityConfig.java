package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    protected UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("javaboy").password("{bcrypt}$2a$10$Sb1gAUH4wwazfNiqflKZve4Ubh.spJcxgHG8Cp29DeGya5zsHENqi").roles("admin", "aaa", "bbb").build());
        manager.createUser(User.withUsername("sang").password("{noop}123").roles("admin").build());
        manager.createUser(User.withUsername("江南一点雨").password("{MD5}{Wucj/L8wMTMzFi3oBKWsETNeXbMFaHZW9vCK9mahMHc=}4d43db282b36d7f0421498fdc693f2a2").roles("user", "aaa", "bbb").build());
        return manager;
    }

    @Configuration
    @Order(1)
    static class DefaultWebSecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.antMatcher("/foo/**")
                    .authorizeRequests()
                    .anyRequest().hasRole("admin")
                    .and().httpBasic()
                    .and()
                    .csrf().disable();
        }
    }

    @Configuration
    @Order(2)
    static class DefaultWebSecurityConfig2 extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                .anyRequest().hasRole("user")
                .and()
                .formLogin().permitAll()
                .and()
                .csrf().disable();
        }
    }
}