package com.example.ejercicio10.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicio10.entity.Tarea;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
}
