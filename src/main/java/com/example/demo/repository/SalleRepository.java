package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Salle;

@Component
public interface SalleRepository extends JpaRepository<Salle, Integer>  {

	Salle findById(long id);
}
