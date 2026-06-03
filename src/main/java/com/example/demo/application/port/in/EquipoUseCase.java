/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.application.port.in;

import com.example.demo.domain.model.Equipo;

import java.util.List;

/**
 *
 * @author lm-carlos
 */
public interface EquipoUseCase {
    
    List<Equipo> listarTodos();

    Equipo buscarPorId(Long id);

    Equipo guardar(Equipo equipo);

    void eliminar(Long id);
    
}
