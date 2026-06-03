package com.example.demo.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author lm-carlos
 */
@Entity
@Table(name = "equipo")
@Data
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nombre;

    private String eslogan;

    @NotEmpty
    private String tecnico;

    @NotEmpty
    private String pais;

    @NotEmpty
    private String ciudad;

    @NotEmpty
    private String categoria;

    @PositiveOrZero
    private int numGoles;

    @PositiveOrZero
    private int numPartidosJugados;

    @PositiveOrZero
    private int numPartidosGanados;

    @PositiveOrZero
    private int numCampeonatos;

    @PositiveOrZero
    private int numExpulsiones;

    @PositiveOrZero
    private int numEmpates;

}
