/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.cursos.cursos.controller;

import com.ejercicio.cursos.cursos.model.Curso;
import com.ejercicio.cursos.cursos.service.ICursoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author adriancuenca
 */
@RestController
public class CursoController {
    
    @Autowired
    ICursoService cursoServi;
    
    @GetMapping("/curso/all")
    public List<Curso> traerCursos(){
        return cursoServi.traerCursos();
    }
    
    @GetMapping("/curso/{id}")
    public Curso traerUnCurso(@PathVariable int id){
        return cursoServi.getCurso(id);
    }
    
    @PostMapping("/curso/crear")
    public String crearCursos(@RequestBody Curso cu){
        cursoServi.crearCurso(cu);
        return "Curso creado correctamente";
    }
    
    @DeleteMapping("/curso/borrar/{id}")
    public String borrarCurso(@PathVariable int id){
        cursoServi.borrarCurso(id);
        return "Curso borrado correctamente";
    }
    
    @PutMapping("/curso/editar/{id}")
    public Curso editarCurso(@PathVariable int id,
            @RequestParam(required = false, name="id")int id_nuevo,
            @RequestParam(required = false,name="nombre")String nuevo_nombre,
            @RequestParam(required = false,name="modalidad")String nueva_modalidad,
            @RequestParam(required = false, name="fecha")String fecha_nueva){
        
        cursoServi.editarCurso(id, id_nuevo, nuevo_nombre, nueva_modalidad, fecha_nueva);
        Curso cu = cursoServi.getCurso(id_nuevo);
        
        return cu;
    }
    
    @GetMapping("/curso/java")
    public List<Curso> cursosConJava(){
        return cursoServi.listaJava();
    }
    
    
}
