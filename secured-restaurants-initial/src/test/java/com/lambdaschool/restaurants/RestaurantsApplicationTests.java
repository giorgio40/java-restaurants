package com.lambdaschool.restaurants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Main class to start the application.
 */
@EnableJpaAuditing
@SpringBootApplication
public class RestaurantsApplicationTests
{
    /**
     * Main method to start the application.
     *
     * @param args Not used in this application.
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RestaurantsApplicationTests.class,
            args);
    }
}
