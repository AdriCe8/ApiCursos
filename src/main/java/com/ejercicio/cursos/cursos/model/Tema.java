/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.cursos.cursos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author adriancuenca
 */
@Entity
@Getter
@Setter
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tema;
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="id_curso")
    private Curso curso;

    public Tema(int id_tema, String nombre, String descripcion) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tema() {
    }

}
