package sbjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sbjpa")
public class SpringBootJPA {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootJPA.class, args);
    }
}
