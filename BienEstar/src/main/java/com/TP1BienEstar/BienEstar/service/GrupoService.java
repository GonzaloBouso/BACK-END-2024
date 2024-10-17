package com.TP1BienEstar.BienEstar.service;

import com.TP1BienEstar.BienEstar.model.Grupo;
import com.TP1BienEstar.BienEstar.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    public Optional<Grupo> findById(String id) {
        return grupoRepository.findById(id);
    }

    public Grupo createGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public Grupo updateGrupo(String id, Grupo grupo) {
        grupo.setId(id);
        return grupoRepository.save(grupo);
    }

    public void deleteGrupo(String id) {
        grupoRepository.deleteById(id);
    }
}