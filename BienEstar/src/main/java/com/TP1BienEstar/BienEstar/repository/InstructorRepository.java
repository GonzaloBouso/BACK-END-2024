package com.TP1BienEstar.BienEstar.repository;

import com.TP1BienEstar.BienEstar.model.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends MongoRepository<Instructor, String> {
    // Aquí puedes definir métodos personalizados si es necesario
}