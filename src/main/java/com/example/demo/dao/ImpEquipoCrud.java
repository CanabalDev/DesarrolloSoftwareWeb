/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dao;

import com.example.demo.modelo.Equipo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author lm-carlos
 */
public interface ImpEquipoCrud extends CrudRepository<Equipo, String> {


}
