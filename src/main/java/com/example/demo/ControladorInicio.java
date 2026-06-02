package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author lm-carlos
 */
@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
