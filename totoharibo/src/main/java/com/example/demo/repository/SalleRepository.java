package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Salle;


public interface SalleRepository extends JpaRepository<Salle, Integer>  {

	Salle findById(long l);
}
