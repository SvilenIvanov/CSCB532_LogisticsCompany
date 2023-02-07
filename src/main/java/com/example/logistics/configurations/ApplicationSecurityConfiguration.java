package com.example.logistics.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter {
    private static final String INDEX = "/";
    private static final String USERS_REGISTER = "/users/register";
    private static final String USERS_LOGIN = "/users/login";
    private static final String SHIPMENTS = "/all_shipments";
    private static final String MY_SHIPMENTS = "/my_shipments";
    private static final String ALL_USERS = "/all_users";
    private static final String HOME = "/home";
    private static final String PASSWORD = "password";
    private static final String USERNAME = "username";
    private static final String USERS_LOGOUT = "/users/logout";

    /*
     * Configuration method for the HttpSecurity
     */
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception  {
        httpSecurity
                .headers()
                .frameOptions()
                .sameOrigin() // restricts the type of requests that are allowed to access the same origin.
                .and()
                .cors() // Cross-origin resource sharing (CORS) is a mechanism that allows many resources (e.g., fonts, JavaScript, etc.)
                // on a web page to be requested from another domain outside the domain from which the resource originated.
                .disable()
                .csrf() // The Cross-Site Request Forgery (CSRF) protection provided by Spring Security.
                .disable()
                .authorizeRequests() // specifies which requests are secured.
                .antMatchers(HOME, SHIPMENTS, MY_SHIPMENTS, ALL_USERS)
                .authenticated() // the user must be authenticated to access these paths.
                .antMatchers(INDEX, USERS_LOGIN, USERS_REGISTER)
                .anonymous() // these paths are open to anonymous users.
                .anyRequest()
                .authenticated() // any other request must be authenticated.
                .and()
                .formLogin() // enables form-based login.
                .loginPage(USERS_LOGIN) // the URL of the login page.
                .usernameParameter(USERNAME) // the name of the request parameter used to pass the username.
                .passwordParameter(PASSWORD) // the name of the request parameter used to pass the password.
                .defaultSuccessUrl(HOME) // the URL to redirect to after a successful login.
                .and()
                .logout() // enables logout.
                .logoutUrl(USERS_LOGOUT) // the URL of the logout page.
                .invalidateHttpSession(true) // invalidates the HTTP session.
                .logoutSuccessUrl(INDEX); // the URL to redirect to after a successful logout.
    }

    /*
     * Configure which requests should be ignored by the security configuration.
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/**/*.js", "/**/*.css")
                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**", "/icon/**",
                        "/scripts/**");
    }

    /*
     * Configure static resource handling.
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
