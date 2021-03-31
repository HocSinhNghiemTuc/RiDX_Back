package com.hust.api;

import com.hust.post.NewPost;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
public class NewAPI {
    @GetMapping(value = "/new")
    public String create(){
        return "Test connect server";
    }
    @PostMapping(value = "/new")
    public NewPost creatNew(@RequestBody NewPost model){
        return model;
    }
    @PutMapping(value = "/new")
    public NewPost updateNew(@RequestBody NewPost model){
        model.setTitle("PUT method");
        return model;
    }
    @DeleteMapping(value = "new")
    public void delete(@RequestBody long[] ids){

    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/new/**").allowedOrigins("http://localhost/").allowedMethods("GET", "POST","PUT", "DELETE");


            }
        };
    }
}
