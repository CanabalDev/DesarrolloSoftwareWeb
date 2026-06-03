package com.example.demo.application.service;

import com.example.demo.domain.model.Equipo;

import com.example.demo.application.port.in.EquipoUseCase;
import com.example.demo.application.port.out.EquipoRepositoryPort;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author lm-carlos
 */
@Service
public class EquipoService implements EquipoUseCase {

    private final EquipoRepositoryPort repository;

    public EquipoService(EquipoRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public List<Equipo> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Equipo buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Equipo guardar(Equipo equipo) {
        return repository.save(equipo);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
