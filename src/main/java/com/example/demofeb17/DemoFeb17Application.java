package com.example.demofeb17;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoFeb17Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        LoginService loginService = new LoginService();
        loginService.doSomething();
    }

    public static void main(String[] args) {

        SpringApplication.run(DemoFeb17Application.class, args);
    }

}
