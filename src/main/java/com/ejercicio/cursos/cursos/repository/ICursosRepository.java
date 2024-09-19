/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio.cursos.cursos.repository;

import com.ejercicio.cursos.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author adriancuenca
 */
@Repository
public interface ICursosRepository extends JpaRepository<Curso, Integer> {
    
}
