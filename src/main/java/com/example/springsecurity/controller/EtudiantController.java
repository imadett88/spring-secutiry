package com.example.springsecurity.controller;

import com.example.springsecurity.model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantController {
    @GetMapping("/liste")
    public List<Etudiant> getEtudiants(){
        return List.of(
                new Etudiant(1,"Lamrani","Yousra"),
                new Etudiant(2,"kessou","Abderrahman"),
                new Etudiant(3,"kessou","Abderrahman")
        );
    }
    @GetMapping("/msg")
    public String getMessage(){
        return "Utilistaurs";
    }
}
