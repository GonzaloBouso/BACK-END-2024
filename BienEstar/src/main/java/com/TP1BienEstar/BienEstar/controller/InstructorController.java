package com.TP1BienEstar.BienEstar.controller;


import com.TP1BienEstar.BienEstar.model.Instructor;
import com.TP1BienEstar.BienEstar.service.InstructorService;
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
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

 @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable String id) {
    return instructorService.findById(id).orElse(null);
    }

    @PostMapping
    public ResponseEntity<Instructor> createInstructor(@RequestBody Instructor instructor) {
        Instructor instructorCreated = instructorService.createInstructor(instructor);
        return ResponseEntity.status(HttpStatus.CREATED).body(instructorCreated);
    }
}