/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyecto_mongo.repository;

import com.example.proyecto_mongo.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author patri
 */
public interface PersonaRepository extends MongoRepository<Persona, Long>{
    
}
