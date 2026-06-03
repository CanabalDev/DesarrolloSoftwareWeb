/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.application.port.out;

import com.example.demo.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public interface UsuarioRepositoryPort {

    List<Usuario> findAll();

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario usuario);

    void deleteById(Long id);

    Optional<Usuario> login(String username, String password);

}
