package com.futebol.futeboldata.Ligas;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LigaConfig {
    @Bean
    CommandLineRunner commandLineRunnerLiga(LigaRepository ligaRepository) {
        return args -> {
            
            
            ligaRepository.saveAll(List.of());

        };
    }
}
