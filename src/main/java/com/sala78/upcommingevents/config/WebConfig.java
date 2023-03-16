package com.sala78.upcommingevents.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements  WebMvcConfigurer {
    @Override

    public void addCorsMappings(CorsRegistry registry){
        registry
        .addMapping("/**")
        .allowedOrigins("http://localhost:5173")
        .allowCredentials(true)
        .allowedMethods("GET", "POST", "DELETE", "OPTION", "PUT");
    }


    @Override
     public void addResourceHandlers(ResourceHandlerRegistry registry){

        registry
        .addResourceHandler("/resources/**")
        .addResourceLocations("classpath:/resources/");
    }

    
    
}
