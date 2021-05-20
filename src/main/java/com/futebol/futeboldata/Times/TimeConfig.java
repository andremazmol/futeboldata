package com.futebol.futeboldata.Times;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {
    @Bean
    CommandLineRunner commandLineRunner(TimeRepository timeRepository) {
        return args -> {
            
            timeRepository.saveAll(List.of());

        };
    }

    
    
    
    
}
