package com.example.restservice.controller;

import com.example.restservice.model.Personaje;
import com.example.restservice.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost"})
@RequestMapping("/api")
public class PersonajeController {

    @Autowired
    PersonajeRepository personajeRepository;

    @GetMapping("/personajes")
    public List<Personaje> getAllPersonajes() {
        return personajeRepository.findAll();
    }
}
