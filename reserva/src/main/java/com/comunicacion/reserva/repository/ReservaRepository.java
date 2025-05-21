package com.comunicacion.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunicacion.reserva.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

}
