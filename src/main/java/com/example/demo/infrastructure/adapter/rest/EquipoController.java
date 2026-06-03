package com.example.demo.infrastructure.adapter.rest;

import com.example.demo.domain.model.Equipo;

import com.example.demo.application.port.in.EquipoUseCase;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lm-carlos
 */
@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    private final EquipoUseCase equipoUseCase;

    public EquipoController(EquipoUseCase equipoUseCase) {
        this.equipoUseCase = equipoUseCase;
    }

    @GetMapping
    public List<Equipo> listarTodos() {
        return equipoUseCase.listarTodos();
    }

    @GetMapping("/{id}")
    public Equipo buscarPorId(@PathVariable Long id) {
        return equipoUseCase.buscarPorId(id);
    }

    @PostMapping
    public Equipo crear(@RequestBody Equipo equipo) {
        return equipoUseCase.guardar(equipo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        equipoUseCase.eliminar(id);
    }

    @PutMapping("/{id}")
    public Equipo actualizar(
            @PathVariable Long id,
            @RequestBody Equipo equipo) {

        equipo.setId(id);

        return equipoUseCase.guardar(equipo);
    }
}
