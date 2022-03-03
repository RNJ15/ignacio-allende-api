package com.example.ignacioallendeapi.controller;


import com.example.ignacioallendeapi.entity.TituloEntity;
import com.example.ignacioallendeapi.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/titulo")
public class TituloController {

    @Autowired()
   private TituloService tituloService;

    @GetMapping("/all")
    public List<TituloEntity> allTittles(){
        return tituloService.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TituloEntity> updateTittle(@RequestBody TituloEntity entity, @PathVariable Integer id){
       Optional<TituloEntity> buscar =tituloService.findById(id);
       if (buscar.isPresent()){
           TituloEntity tituloActualizado=buscar.get();
           tituloActualizado.setTitulo_lectura(entity.getTitulo_lectura());
           tituloActualizado.setPortada(entity.getPortada());
           return  ResponseEntity.status(HttpStatus.ACCEPTED).body(tituloService.save(tituloActualizado));
       }
       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @DeleteMapping("/{id}")
    public String deleteTittle(@PathVariable Integer id){
         Optional<TituloEntity> existe=tituloService.findById(id);
         if (existe.isPresent()){
             tituloService.delete(id);
             return "Titulo Eliminado";
         }
         return "El titulo no existe";
    }
}
