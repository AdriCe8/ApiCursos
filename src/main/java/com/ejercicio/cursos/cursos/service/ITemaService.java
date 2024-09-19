/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicio.cursos.cursos.service;

import com.ejercicio.cursos.cursos.model.Tema;
import java.util.List;

/**
 *
 * @author adriancuenca
 */
public interface ITemaService {
    
    public List<Tema> listaDeTemas();
    public void guardarTema(Tema te);
    public void borrarTema(int id);
    public Tema getTema(int id);
    public void editarTema(int id_original,int id_nueva,String nuevoNombre,String nuevaDes);
    
    
}
