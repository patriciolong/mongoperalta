/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyecto_mongo.controller;

import com.example.proyecto_mongo.model.Persona;
import com.example.proyecto_mongo.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author patri
 */
@RestController
@RequestMapping("/api/Persona")
public class PersonaController {
     @Autowired
     PersonaService casasService;
    
@GetMapping("/lista")
public ResponseEntity<List<Persona>> listar(){
 return new ResponseEntity<>(casasService.findByAll(),HttpStatus.OK);
}



@PostMapping("/crear")
 public ResponseEntity<Persona>crear(Persona p){
     return new ResponseEntity<>(casasService.save(p),HttpStatus.CREATED);
 }
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Persona>eliminar(@PathVariable Long id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }
// @GetMapping("/buscar/{id}")
// public ResponseEntity<Casas>buscar(@PathVariable Long id){
////     casasService.listado(id);
//     return new ResponseEntity<>(buscarCasas(id),HttpStatus.OK);
// }
 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Persona> actualizar(@PathVariable Long id, @RequestBody Persona p){
     Persona casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
             casa.setId(p.getId());
             casa.setNombre(p.getNombre());
             casa.setApellido(p.getApellido());
             casa.setDireccion(p.getDireccion());
            
             
         return new ResponseEntity<>(casasService.save(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
 
 public Persona buscarCasas(@PathVariable Long id){
     return casasService.findById(id);
}
 
// @GetMapping("/BuscarCodigo/{codigo}")
//public ResponseEntity<List<Persona>> listado(@PathVariable String codigo){
//
// return new ResponseEntity<>(casasService.listado(codigo),HttpStatus.OK);
//}
}
