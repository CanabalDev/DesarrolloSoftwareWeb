package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.modelo.Equipo;
import java.util.Arrays;
import java.util.List;

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

        Equipo realMadrid = new Equipo();
        realMadrid.setNombre("Real Madrid");
        realMadrid.setEslogan("Hala Madrid");
        realMadrid.setTecnico("Xabi Alonso");
        realMadrid.setPais("España");
        realMadrid.setCiudad("Madrid");
        realMadrid.setCategoria("La Liga");
        realMadrid.setNumGoles(78);
        realMadrid.setNumPartidosJugados(38);
        realMadrid.setNumPartidosGanados(26);
        realMadrid.setNumCampeonatos(36);
        realMadrid.setNumExpulsiones(2);
        realMadrid.setNumEmpates(6);

        Equipo bayern = new Equipo();
        bayern.setNombre("Bayern Munich");
        bayern.setEslogan("Mia San Mia");
        bayern.setTecnico("Vincent Kompany");
        bayern.setPais("Alemania");
        bayern.setCiudad("Munich");
        bayern.setCategoria("Bundesliga");
        bayern.setNumGoles(95);
        bayern.setNumPartidosJugados(34);
        bayern.setNumPartidosGanados(25);
        bayern.setNumCampeonatos(34);
        bayern.setNumExpulsiones(1);
        bayern.setNumEmpates(5);

        Equipo realCartagena = new Equipo();
        realCartagena.setNombre("Real Cartagena");
        realCartagena.setEslogan("Orgullo Heroico");
        realCartagena.setTecnico("Martín Cardetti");
        realCartagena.setPais("Colombia");
        realCartagena.setCiudad("Cartagena");
        realCartagena.setCategoria("Segunda Division");
        realCartagena.setNumGoles(42);
        realCartagena.setNumPartidosJugados(32);
        realCartagena.setNumPartidosGanados(16);
        realCartagena.setNumCampeonatos(1);
        realCartagena.setNumExpulsiones(4);
        realCartagena.setNumEmpates(8);

        Equipo arsenal = new Equipo();
        arsenal.setNombre("Arsenal");
        arsenal.setEslogan("Victoria Concordia Crescit");
        arsenal.setTecnico("Mikel Arteta");
        arsenal.setPais("Inglaterra");
        arsenal.setCiudad("Londres");
        arsenal.setCategoria("Premier");
        arsenal.setNumGoles(74);
        arsenal.setNumPartidosJugados(38);
        arsenal.setNumPartidosGanados(23);
        arsenal.setNumCampeonatos(13);
        arsenal.setNumExpulsiones(3);
        arsenal.setNumEmpates(9);

        List<Equipo> listaEquipos = Arrays.asList(
                realMadrid, bayern, realCartagena, arsenal
        );

        modelo.addAttribute("equipoFavorito", inter);

        modelo.addAttribute("equipos", listaEquipos);

        log.info("Ejecutando el controlador de inicio");
        return "index";
    }
}
