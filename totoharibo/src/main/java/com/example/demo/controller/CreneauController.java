package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Creneau;
import com.example.demo.repository.CreneauRepository;



@RestController
@RequestMapping("creneaus")
public class CreneauController {
	private CreneauRepository CreneauRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Creneau creneau){
		System.out.println(creneau);
		CreneauRepository.save(creneau);
	}
	
	@GetMapping("/all")
	public List<Creneau> findAll(){
		return CreneauRepository.findAll();
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		System.out.println("id = "+id);
		Creneau creneau = CreneauRepository.findById((id));
		CreneauRepository.delete(creneau);
	}
	
}
