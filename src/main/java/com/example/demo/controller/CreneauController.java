package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Creneau;
import com.example.demo.repository.CreneauRepository;

@RestController
@RequestMapping("creneaus")
public class CreneauController {
	@Autowired
	CreneauRepository CreneauRepository;

	@PostMapping("/save")
	public void save(@RequestBody Creneau Creneau){
		CreneauRepository.save(Creneau);
	}
	
	@GetMapping("/all")
	public List<Creneau> load(){
		return CreneauRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id){
		CreneauRepository.delete(CreneauRepository.findById(id));
	}
	
	
}
