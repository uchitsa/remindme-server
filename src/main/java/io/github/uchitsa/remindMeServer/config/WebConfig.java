package io.github.uchitsa.remindMeServer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("io.github.uchitsa.remindMeServer")
public class WebConfig extends WebMvcConfigurerAdapter {
}
