package com.example.demo.controladores;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modelo.Equipo;
import com.example.demo.servicio.IntEquipoServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author lm-carlos
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Autowired

    IntEquipoServicio equipoServicio;
    
    @GetMapping("/")
    public String inicio(Model modelo) {

        List<Equipo> listaEquipos = (List<Equipo>) equipoServicio.listarTodos();
        modelo.addAttribute("equipos", listaEquipos);
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
