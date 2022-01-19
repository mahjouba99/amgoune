package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Bloc;
import com.example.demo.model.Creneau;

@Component
public interface CreneauRepository extends JpaRepository<Creneau, Integer>  {

	Creneau findById(long id);
}
