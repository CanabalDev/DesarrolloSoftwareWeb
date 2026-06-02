package com.example.demo.controladores;

import com.example.demo.dao.ImpEquipoCrud;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modelo.Equipo;
import java.util.Arrays;
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
    ImpEquipoCrud crudEquipo;

    @GetMapping("/")
    public String inicio(Model modelo) {

        List<Equipo> listaEquipos = (List<Equipo>) crudEquipo.findAll();
        modelo.addAttribute("equipos", listaEquipos);
        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
