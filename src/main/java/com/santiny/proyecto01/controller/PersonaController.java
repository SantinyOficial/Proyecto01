package com.santiny.proyecto01.controller;

import com.santiny.proyecto01.model.entity.Persona;
import com.santiny.proyecto01.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaController {

    @Autowired
    IPersonaService personaService;

    @PostMapping("/personas")
    public ResponseEntity<?> savePersona(@RequestBody Persona persona){
        Persona newPersona = personaService.crearPersona(persona);
        return new ResponseEntity<>(newPersona, HttpStatus.CREATED);
    }

    @GetMapping("/personas")
    public ResponseEntity<?> findAllPersona(){
        List<Persona> listPersonas = personaService.obtenerTodas();
        return new ResponseEntity<>(listPersonas, HttpStatus.OK);
    }

    @GetMapping("/personas/{id}")
    public ResponseEntity<?> findByIdPersona(@PathVariable Long id){
        Persona findById = personaService.obtenerPorId(id);
        return new ResponseEntity<>(findById, HttpStatus.OK);
    }

    @PutMapping("/personas/{id}")
    public ResponseEntity<?> updatePersona(@RequestBody Persona persona, @PathVariable Long id){
        Persona update = personaService.actualizarPersona(id, persona);
        return new ResponseEntity<>(update, HttpStatus.OK);
    }

}
