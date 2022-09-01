/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto_mongo.service;

import com.example.proyecto_mongo.model.Persona;
import com.example.proyecto_mongo.model.Rol;
import com.example.proyecto_mongo.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author patri
 */
@Service
public class RolServiceImpl extends GenericServiceImpl<Rol, Long> implements RolService{
        @Autowired
        RolRepository pr;
    
    @Override
    public CrudRepository<Rol,Long> getDao(){
        return pr;
    }
    
}
