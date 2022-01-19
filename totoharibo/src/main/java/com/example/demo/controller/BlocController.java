package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bloc;
import com.example.demo.repository.BlocRepository;

@RestController
@RequestMapping("blocs")
public class BlocController {
	@Autowired
	BlocRepository blocRepository;

	@PostMapping("/save")
	public void save(@RequestBody Bloc bloc){
		blocRepository.save(bloc);
	}
	
	@GetMapping("/all")
	public List<Bloc> load(){
		return blocRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id){
		blocRepository.delete(blocRepository.findById(id));
	}
	
	@GetMapping("/count")
	public Map<String, Integer> count (){
		Map<String, Integer> map = new HashMap<>();
		for(Bloc m : blocRepository.findAll()){
			map.put(m.getCode(), m.getSalles().size());
		}
		return map;
	}
	
}
