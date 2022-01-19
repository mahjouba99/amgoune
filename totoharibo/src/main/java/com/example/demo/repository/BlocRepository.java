package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Bloc;

@Component
public interface BlocRepository extends JpaRepository<Bloc, Integer>  {

	Bloc findById(long id);
}
