/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio.cursos.cursos.service;

import com.ejercicio.cursos.cursos.model.Tema;
import com.ejercicio.cursos.cursos.repository.ITemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author adriancuenca
 */
@Service
public class TemaService implements ITemaService{
    
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public List<Tema> listaDeTemas() {
        return temaRepo.findAll();
    }

    @Override
    public void guardarTema(Tema te) {
        temaRepo.save(te);
    }

    @Override
    public void borrarTema(int id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema getTema(int id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarTema(int id_original, int id_nueva, String nuevoNombre, String nuevaDes) {
        
        Tema te = this.getTema(id_original);
        te.setId_tema(id_nueva);
        te.setNombre(nuevoNombre);
        te.setDescripcion(nuevaDes);
        
        this.guardarTema(te);
    }
    
    
}
