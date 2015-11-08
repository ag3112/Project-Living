package com.dietnn.service;

import com.dietnn.service.controllers.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = UserController.class)
public class WebConfig extends WebMvcConfigurerAdapter {

}
