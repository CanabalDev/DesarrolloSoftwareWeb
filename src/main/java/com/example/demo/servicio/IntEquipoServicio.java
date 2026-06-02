/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.servicio;

import com.example.demo.modelo.Equipo;
import java.util.List;

/**
 *
 * @author lm-carlos
 */
public interface IntEquipoServicio {
    
    public List<Equipo> listarTodos();
    
    public void guardar (Equipo equipo);
    
    public void eliminar (Equipo equipo);
    
    public Equipo buscar (Equipo equipo);

}
