package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.model.Machine;
@Component
public interface MachineRepository extends JpaRepository<Machine, Integer> {

	Machine findById(long id);
}
