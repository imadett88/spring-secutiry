package com.example.springsecurity.service;

import com.example.springsecurity.model.Note;
import com.example.springsecurity.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceNote {
    @Autowired
    NoteRepository noteRepository;
    public List<Note> listeNote(){
        return noteRepository.findAll();
    }
    public List<Note> listeNoteParUser(String nom){
        return noteRepository.getNotesByUsername(nom);
    }
}