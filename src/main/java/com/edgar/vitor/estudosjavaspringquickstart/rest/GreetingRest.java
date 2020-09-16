package com.edgar.vitor.estudosjavaspringquickstart.rest;

import com.edgar.vitor.estudosjavaspringquickstart.rest.dto.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("")
public class GreetingRest {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/response-entity")
    public ResponseEntity<Greeting> responseEntity(@RequestParam(value = "name", defaultValue = "World") String name) {
        return ResponseEntity.ok(new Greeting(counter.incrementAndGet(), String.format(template, name)));
    }
}
