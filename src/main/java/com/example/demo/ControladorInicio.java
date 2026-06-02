package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lm-carlos
 */
@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(){
        System.out.println("ENTRO AL CONTROLADOR");
        log.info("Ejecutando el controlador de inicio");
        return "Este es el inicio! v2.0";
    }
}
