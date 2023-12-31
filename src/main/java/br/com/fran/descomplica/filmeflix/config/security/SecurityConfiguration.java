package br.com.fran.descomplica.filmeflix.config.security;

import br.com.fran.descomplica.filmeflix.enums.EnumPerfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private final FilterChainExceptionHandler filterChainExceptionHandler;
    private final TokenSecurityFilter tokenSecurityFilter;

    @Autowired
    public SecurityConfiguration(FilterChainExceptionHandler filterChainExceptionHandler, TokenSecurityFilter tokenSecurityFilter) {
        this.filterChainExceptionHandler = filterChainExceptionHandler;
        this.tokenSecurityFilter = tokenSecurityFilter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors().and().csrf().disable()
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(
                        authorize -> authorize
                                .antMatchers(this.allowed()).permitAll()
                                .antMatchers("/admins/**").hasAuthority(EnumPerfil.ADMIN.toString())
                                .anyRequest().authenticated()
                )
                .addFilterBefore(filterChainExceptionHandler, LogoutFilter.class)
                .addFilterBefore(tokenSecurityFilter, UsernamePasswordAuthenticationFilter.class)
                .httpBasic();
        return http.build();
    }

    private String[] allowed() {
        return new String[]{
            "/v3/api-docs/**",
            "/swagger-ui/**",
            "/swagger-ui.html",
            "/webjars/swagger-ui/**",
            "/auth/**",
            "/config/",
            "/config/**"
        };
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
