/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.application.port.in;

import com.example.demo.domain.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public interface UsuarioUseCase {

    List<Usuario> listarTodos();

    Usuario buscarPorId(Long id);

    Usuario guardar(Usuario usuario);

    void eliminar(Long id);
    
    Optional<Usuario> login(
        String username,
        String password);
}
