/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.cursos.cursos.service;

import com.ejercicio.cursos.cursos.model.Curso;
import com.ejercicio.cursos.cursos.repository.ICursosRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author adriancuenca
 */
@Service
public class CursoService implements ICursoService {

    @Autowired
    ICursosRepository cursoRepo;

    @Override
    public List<Curso> traerCursos() {
        List<Curso> listaDeCursos = cursoRepo.findAll();
        return listaDeCursos;
    }

    @Override
    public void borrarCurso(int id) {

        cursoRepo.deleteById(id);
    }

    //CREAR O GUARDAR ES LO MISMO
    @Override
    public void crearCurso(Curso cu) {

        cursoRepo.save(cu);
    }

    @Override
    public Curso getCurso(int id) {
        
        Curso cu  = cursoRepo.findById(id).orElse(null);
        return cu;
    }

    @Override
    public void editarCurso(int id_original, int id_nuevo, String nuevoNombre, String nuevoModalidad, String nuevaFecha) {
        
        Curso cu = this.getCurso(id_original);
        cu.setId_curso(id_nuevo);
        cu.setNombre(nuevoNombre);
        cu.setModalidad(nuevoModalidad);
        cu.setFecha(nuevaFecha);
        
        this.crearCurso(cu);
    }

    @Override
    public List<Curso> listaJava() {
        
        String palabra = "Java";
        String textoAComparar = "";
        
        List<Curso> listaDeCursos = this.traerCursos();
        List<Curso> cursoConJava = new ArrayList<>();
        
        for(Curso cu : listaDeCursos){
            
            textoAComparar = cu.getNombre();
            boolean tieneJava = textoAComparar.contains(palabra);
            if(tieneJava){
                cursoConJava.add(cu);
            }
        }
        return cursoConJava;
    }

}
