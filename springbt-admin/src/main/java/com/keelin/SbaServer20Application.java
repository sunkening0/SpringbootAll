package com.keelin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SbaServer20Application {
    public static void main(String[] args) {
        SpringApplication.run(SbaServer20Application.class, args);
    }
}
