package org.example.config;

import org.example.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    @Bean
    public List<Student> getDatabase(){
        List<Student> database = new ArrayList<>();
        return database;
    }
}
