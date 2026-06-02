package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modelo.Equipo;

/**
 *
 * @author lm-carlos
 */
@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.mensaje}")
    String dato;

    @GetMapping("/")
    public String inicio(Model modelo) {

        String mensaje = "Saludos MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);

        Equipo inter = new Equipo();

        inter.setNombre("Inter de Milan");
        inter.setEslogan("Forza Inter");
        inter.setTecnico("Cristian Chivu");
        inter.setPais("Italia");
        inter.setCiudad("Milan");
        inter.setCategoria("Serie A");

        inter.setNumGoles(89);
        inter.setNumPartidosJugados(38);
        inter.setNumPartidosGanados(27);
        inter.setNumCampeonatos(21);
        inter.setNumExpulsiones(3);
        inter.setNumEmpates(6);

        modelo.addAttribute("equipo",inter);
        
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
