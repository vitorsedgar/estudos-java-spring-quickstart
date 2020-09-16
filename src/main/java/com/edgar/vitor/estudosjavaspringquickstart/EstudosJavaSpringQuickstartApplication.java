package com.edgar.vitor.estudosjavaspringquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EstudosJavaSpringQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudosJavaSpringQuickstartApplication.class, args);
    }

}
