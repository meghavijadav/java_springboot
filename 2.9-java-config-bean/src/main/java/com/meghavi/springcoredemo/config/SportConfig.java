package com.meghavi.springcoredemo.config;

import com.meghavi.springcoredemo.common.Coach;
import com.meghavi.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
