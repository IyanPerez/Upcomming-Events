package com.sala78.upcommingevents.config;


import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.sala78.upcommingevents.services.JpaUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    // Add
    private  JpaUserDetailsService jpaUserDetailsService;

    public SecurityConfig(JpaUserDetailsService jpaUserDetailsService){
        this.jpaUserDetailsService = jpaUserDetailsService;
    }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
            .cors()
            .and()
            .csrf(csrf -> csrf.disable())
            .formLogin(form -> form.disable())
            .logout(logout -> logout
                              .logoutUrl("/api/logout")
                              .deleteCookies("JSESSIONID"))
                              .authorizeRequests((auth) -> auth
                                                .antMatchers("/api/user").hasRole("USER")
                                                .antMatchers("/api/admin").hasRole("ADMIN")
                                                .anyRequest().authenticated())
                                                .headers(header -> header.frameOptions().sameOrigin())
                                                .userDetailsService(jpaUserDetailsService)
                                                .sessionManagement(session -> session.sessionCreatePolicy(SessionCreatePolicy.ALWAYS))
                                                .httpBasic(basic -> basic.authenticationEntryPoint(authenticationEntryPoint));

                                                return http.build();
                                                
            
    
    }

    @Bean
    public  InMemoryUserDetailsManager userDetailsService(){
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String password = encoder.encode("1234");
        System.out.println(password);

        UserDetails admin = User.withUsername("admin")
                            .password(password)
                            .roles("ADMIN")
                            .build();


       UserDetails user = User.withUsername("user")
                          .password(password)
                          .roles("USER")
                          .build();
                          
                          
         Collection<UserDetails> users = new ArrayList<>();
         users.add(admin);
         users.add(user);    
         
         return new  InMemoryUserDetailsManager(users);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

   

}
