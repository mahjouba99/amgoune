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

@RestController
@RequestMapping("reservations")
public class ReservationController {
	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private CreneauRepository creneauRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	@Autowired
	private UserRepository userRepository;
	

	@PostMapping("/save")
	public void save(@RequestBody Reservation reservation){
		reservation = new Reservation(
			    new ReservationKey(
				reservation.getSalle().getId(),reservation.getCreneau().getId()),
				reservation.getDate(),
				reservation.getSalle(),
				reservation.getCreneau(),
				reservation.getUser(),
				"En attente");
		reservationRepository.save(reservation);
	}
	@GetMapping("/all")
	public List<Reservation> findAll()
	{
		return reservationRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id){
	//	System.out.println(id.salle);
		reservationRepository.delete(reservationRepository.findById(id));
	}
}
