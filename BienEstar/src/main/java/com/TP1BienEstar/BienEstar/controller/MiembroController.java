package com.TP1BienEstar.BienEstar.controller;

import com.TP1BienEstar.BienEstar.model.Miembro; // Asegúrate de que esta ruta sea correcta
import com.TP1BienEstar.BienEstar.service.MiembroService; // Asegúrate de que esta ruta sea correcta
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/members")
public class MiembroController {

    @Autowired
    private MiembroService miembroService;

    @GetMapping("/{id}")
    public ResponseEntity<Miembro> obtenerMiembro(@PathVariable String id) {
    Optional<Miembro> miembroOpt = miembroService.findById(id); // Cambiado a findById y String
    if (miembroOpt.isPresent()) {
        return ResponseEntity.ok(miembroOpt.get());
    } else {
        return ResponseEntity.notFound().build();
    }
}

    @PostMapping
    public ResponseEntity<Miembro> crearMiembro(@RequestBody Miembro miembro) {
    Miembro nuevoMiembro = miembroService.createMiembro(miembro); // Cambiado a createMiembro
    return ResponseEntity.status(HttpStatus.CREATED).body(nuevoMiembro);
}

    // Otros métodos para actualizar y eliminar miembros
}