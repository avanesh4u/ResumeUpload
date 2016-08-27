package com.cap.resume.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
      
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("user@123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("admin@123").roles("ADMIN");
       // auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");
    }
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       
      http.authorizeRequests()
        .antMatchers("/", "/home").permitAll()
        .antMatchers("/admin/**").access("hasRole('ADMIN')")
      //  .antMatchers("/user/**").access("hasRole('ADMIN') and hasRole('DBA')")
        .and().formLogin().loginPage("/login")
        .usernameParameter("ssoId").passwordParameter("password")
        .and().csrf()
        .and().exceptionHandling().accessDeniedPage("/Access_Denied");
    }
}
