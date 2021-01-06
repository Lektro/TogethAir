package com.togethair;

import com.togethair.model.Airline;
import com.togethair.service.AirlineService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppStart {

    public static void main(String[] args) {

        SpringApplication.run(AppStart.class, args);
        }

/*        @Bean
        CommandLineRunner runner(AirlineService airlineService) {
            return args -> {

                //not saving
                airlineService.save(new Airline(1L,"KLM"));

            };
        }*/
}

