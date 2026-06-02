package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lm-carlos
 */
@RestController
public class ControladorDemo {
    
        @GetMapping("/")
    public String inicio() {
        return "Hola Spring Boot";
    }

}
