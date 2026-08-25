package hu.komplexmicroservice.rendszerservice;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@RequiredArgsConstructor
@EnableCaching
@SpringBootApplication
public class RendszerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RendszerServiceApplication.class, args);
    }

}
