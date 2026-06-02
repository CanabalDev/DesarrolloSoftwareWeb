package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author lm-carlos
 */

@Entity
@Table(name="equipo")
@Data
public class Equipo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id

    private String nombre;
    private String eslogan;
    private String tecnico;
    private String pais;
    private String ciudad;
    private String categoria;

    private int numGoles;
    private int numPartidosJugados;
    private int numPartidosGanados;
    private int numCampeonatos;
    private int numExpulsiones;
    private int numEmpates;

 
    
    
    
}
