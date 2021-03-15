package com.single.single.rbac;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client1")
                .resourceIds("resource_id")
                .authorizedGrantTypes("authorization_code", "refresh_token", "implicit")
                .authorities("ROLE_CLIENT")
                .scopes("get_user_info", "get_childlist")
                .secret("secret")
                .redirectUris("http://www.baidu.com")
                .autoApprove(true)
                .autoApprove("get_user_info");
    }
}
