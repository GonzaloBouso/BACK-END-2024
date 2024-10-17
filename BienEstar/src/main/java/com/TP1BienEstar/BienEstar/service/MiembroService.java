package com.TP1BienEstar.BienEstar.service;

import com.TP1BienEstar.BienEstar.model.Miembro;
import com.TP1BienEstar.BienEstar.repository.MiembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MiembroService {

    @Autowired
    private MiembroRepository miembroRepository;

    public List<Miembro> findAll() {
        return miembroRepository.findAll();
    }

    public Optional<Miembro> findById(String id) {
        return miembroRepository.findById(id);
    }

    public Miembro createMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }

    public Miembro updateMiembro(String id, Miembro miembro) {
        miembro.setId(id);
        return miembroRepository.save(miembro);
    }

    public void deleteMiembro(String id) {
        miembroRepository.deleteById(id);
    }
}