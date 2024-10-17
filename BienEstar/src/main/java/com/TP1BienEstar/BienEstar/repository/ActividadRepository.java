package com.TP1BienEstar.BienEstar.repository;

import com.TP1BienEstar.BienEstar.model.Actividad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends MongoRepository<Actividad, String> {
    // Aquí puedes definir métodos personalizados si es necesario
}