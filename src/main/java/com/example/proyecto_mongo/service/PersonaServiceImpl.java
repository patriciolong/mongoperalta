/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto_mongo.service;

import com.example.proyecto_mongo.model.Persona;
import com.example.proyecto_mongo.repository.PersonaRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


/**
 *
 * @author patri
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{
    
    @Autowired
    PersonaRepository pr;
    
    @Override
    public CrudRepository<Persona,Long> getDao(){
        return pr;
    }
    
}
