package com.example.demo.application.service;

import com.example.demo.domain.model.Usuario;

import com.example.demo.application.port.in.UsuarioUseCase;
import com.example.demo.application.port.out.UsuarioRepositoryPort;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author lm-carlos
 */
@Service
public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepositoryPort repository;

    public UsuarioService(UsuarioRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Usuario guardar(Usuario equipo) {
        return repository.save(equipo);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Usuario> login(
            String username,
            String password) {

        return repository.login(username, password);
    }
}
