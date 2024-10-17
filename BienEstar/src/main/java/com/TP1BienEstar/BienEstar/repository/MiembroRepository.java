package com.TP1BienEstar.BienEstar.repository;

import com.TP1BienEstar.BienEstar.model.Miembro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembroRepository extends MongoRepository<Miembro, String> {
    // Aquí puedes definir métodos personalizados si es necesario
}