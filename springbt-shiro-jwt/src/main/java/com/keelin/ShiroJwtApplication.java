package com.keelin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.keelin.mapper")
public class ShiroJwtApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ShiroJwtApplication.class, args);
    }
}
