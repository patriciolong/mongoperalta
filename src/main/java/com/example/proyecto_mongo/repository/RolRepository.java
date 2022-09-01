/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.proyecto_mongo.repository;

import com.example.proyecto_mongo.model.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author patri
 */
public interface RolRepository extends MongoRepository<Rol, Long>{
    
}
