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
import com.example.demo.model.Reservation;
import com.example.demo.model.ReservationKey;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.CreneauRepository;
import com.example.demo.repository.SalleRepository;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping("reservations2")
public class ReservationController2 {
	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private CreneauRepository creneauRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private UserRepository userRepository;

	
	

	@GetMapping("/all")
	public List<Reservation> findAll(){
		return reservationRepository.findAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody Reservation reservation){
		/* reservation = new Reservation(new ReservationKey(reservation.getSalle().getId(),reservation.getCreneau().getId()),
				reservation.getDate(),
				reservation.getSalle(),
				reservation.getCreneau(),
				reservation.getUser()
				,reservation.getStatut());
				*/
		System.out.println(reservation);
		reservation.setCreneau(creneauRepository.findById(reservation.getCreneau().getId()));
		reservation.setSalle(salleRepository.findById(reservation.getSalle().getId()));
		reservationRepository.save(reservation);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id){
		reservationRepository.delete(reservationRepository.findById(id));
	}
}
