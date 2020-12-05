package com.github.cemyeniceri.unicraft.beer.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class UnicraftBeerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnicraftBeerConfigServerApplication.class, args);
    }

}
