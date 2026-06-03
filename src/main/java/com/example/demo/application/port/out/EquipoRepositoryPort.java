/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.application.port.out;

import com.example.demo.domain.model.Equipo;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public interface EquipoRepositoryPort {
    
    List<Equipo> findAll();

    Optional<Equipo> findById(Long id);

    Equipo save(Equipo equipo);

    void deleteById(Long id);
    
}
