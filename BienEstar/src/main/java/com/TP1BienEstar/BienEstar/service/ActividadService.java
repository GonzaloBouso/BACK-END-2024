package com.TP1BienEstar.BienEstar.service;

import com.TP1BienEstar.BienEstar.model.Actividad;
import com.TP1BienEstar.BienEstar.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;

    public List<Actividad> findAll() {
        return actividadRepository.findAll();
    }

    public Optional<Actividad> findById(String id) {
        return actividadRepository.findById(id);
    }

    public Actividad createActividad(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    public Actividad updateActividad(String id, Actividad actividad) {
        actividad.setId(id);
        return actividadRepository.save(actividad);
    }

    public void deleteActividad(String id) {
        actividadRepository.deleteById(id);
    }
}