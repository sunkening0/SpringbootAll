package com.keelin;

import com.keelin.service.Md5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MD5AutoConfiguration {
    @Bean
    Md5Service md5Service() {
        return new Md5Service();
    }
}







