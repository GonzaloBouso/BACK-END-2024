package com.TP1BienEstar.BienEstar.repository;

import com.TP1BienEstar.BienEstar.model.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends MongoRepository<Grupo, String> {
    // Aquí puedes definir métodos personalizados si es necesario
}