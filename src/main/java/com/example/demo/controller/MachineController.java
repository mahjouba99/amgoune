package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Machine;
import com.example.demo.repository.MachineRepository;
import com.example.demo.repository.MarqueRepository;
import com.example.demo.repository.SalleRepository;

@RestController
@RequestMapping("machines")
public class MachineController {
	@Autowired
	private MachineRepository machineRepository;

	@Autowired
	private MarqueRepository marqueRepository;
	@Autowired
	private SalleRepository salleRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Machine machine){
		System.out.println(machine);
		machine.setMarque(marqueRepository.findById(machine.getMarque().getId()));
		machine.setSalle(salleRepository.findById(machine.getSalle().getId()));
		machineRepository.save(machine);
	}
	
	@GetMapping("/all")
	public List<Machine> findAll(){
		return machineRepository.findAll();
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		System.out.println("id = "+id);
		Machine machine = machineRepository.findById((id));
		machineRepository.delete(machine);
	}
	
}
