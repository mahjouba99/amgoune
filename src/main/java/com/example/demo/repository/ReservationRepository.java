package com.example.demo.repository;

import com.example.demo.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    Reservation findById(long id);

}