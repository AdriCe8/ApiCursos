/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.cursos.cursos.controller;

import com.ejercicio.cursos.cursos.model.Tema;
import com.ejercicio.cursos.cursos.service.ITemaService;
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
public class TemaController {
    
    @Autowired
    private ITemaService temaSer;
    
    @GetMapping("/temas/all")
    public List<Tema> listaTemas(){
        return temaSer.listaDeTemas();
    }
    
    @GetMapping("/temas/{id}")
    public Tema getTema(@PathVariable int id){
        return temaSer.getTema(id);
    }
    
    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema te){
        temaSer.guardarTema(te);
        return "Tema creado";
    }
    
    @DeleteMapping("/temas/{id}")
    public String borrarTema(int id){
        temaSer.borrarTema(id);
        return "Tema borrado";
    }
    
    @PutMapping("/temas/editar/{id}")
    public Tema editarTema(@PathVariable int id, @RequestParam(required = false, name="id")int id_nueva,
            @RequestParam(required = false, name="nombre")String nuevo_nombre,
            @RequestParam(required = false, name="descripcion")String nuevaDes){
        
       
        temaSer.editarTema(id, id_nueva, nuevo_nombre, nuevaDes);
        Tema te = temaSer.getTema(id_nueva);
       
        return te;
    }
    
    
    
}
