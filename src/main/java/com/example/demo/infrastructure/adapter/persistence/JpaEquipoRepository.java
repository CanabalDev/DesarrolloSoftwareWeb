/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.infrastructure.adapter.persistence;

import com.example.demo.domain.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lm-carlos
 */
public interface JpaEquipoRepository extends JpaRepository<Equipo, Long> {
    
}
