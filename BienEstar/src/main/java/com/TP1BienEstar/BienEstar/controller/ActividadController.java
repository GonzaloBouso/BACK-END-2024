package com.TP1BienEstar.BienEstar.controller;

import com.TP1BienEstar.BienEstar.model.Actividad;
import com.TP1BienEstar.BienEstar.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actividades")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    @GetMapping("/{id}")
    public Actividad getActividadById(@PathVariable String id) {
    return actividadService.findById(id).orElse(null);
    }

    @PostMapping
    public ResponseEntity<Actividad> createActividad(@RequestBody Actividad actividad) {
        Actividad actividadCreated = actividadService.createActividad(actividad);
        return ResponseEntity.status(HttpStatus.CREATED).body(actividadCreated);
    }
}