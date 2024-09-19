/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio.cursos.cursos.service;


import com.ejercicio.cursos.cursos.model.Curso;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author adriancuenca
 */
public interface ICursoService {
    
    
    public List<Curso> traerCursos();
    public void borrarCurso(int id);
    public void crearCurso(Curso cu);
    public Curso getCurso(int id);
    public void editarCurso(int id_original, int id_nuevo, String nuevoNombre, String nuevoModalidad, String nuevaFecha);
    public List<Curso> listaJava();
    
    
}
