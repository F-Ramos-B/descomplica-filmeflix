package br.com.fran.descomplica.filmeflix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/auth/**").permitAll()
                .antMatchers("/config/**").permitAll()
                .antMatchers("/config/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
        return http.build();
    }

}
