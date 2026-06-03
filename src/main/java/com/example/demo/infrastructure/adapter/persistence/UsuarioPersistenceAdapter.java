package com.example.demo.infrastructure.adapter.persistence;

import com.example.demo.domain.model.Usuario;

import com.example.demo.application.port.out.UsuarioRepositoryPort;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author lm-carlos
 */
@Component
public class UsuarioPersistenceAdapter implements UsuarioRepositoryPort {

    private final JpaUsuarioRepository repository;

    public UsuarioPersistenceAdapter(JpaUsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Usuario save(Usuario equipo) {
        return repository.save(equipo);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Usuario> login(
            String username,
            String password) {

        return repository.findByUsernameAndPassword(
                username,
                password);
    }

}
