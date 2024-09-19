/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio.cursos.cursos.repository;

import com.ejercicio.cursos.cursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author adriancuenca
 */
public interface ITemaRepository extends JpaRepository<Tema, Integer> {
    
}
