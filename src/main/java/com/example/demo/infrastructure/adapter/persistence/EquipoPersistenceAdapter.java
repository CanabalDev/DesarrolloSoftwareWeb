package com.example.demo.infrastructure.adapter.persistence;

import com.example.demo.application.port.out.EquipoRepositoryPort;
import com.example.demo.domain.model.Equipo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public class EquipoPersistenceAdapter implements EquipoRepositoryPort {
    
    private final JpaEquipoRepository repository;

    public EquipoPersistenceAdapter(JpaEquipoRepository repository) {
        this.repository = repository;
    }
    
     @Override
    public List<Equipo> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Equipo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Equipo save(Equipo equipo) {
        return repository.save(equipo);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    
}
