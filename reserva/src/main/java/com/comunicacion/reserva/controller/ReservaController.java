package com.comunicacion.reserva.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.comunicacion.reserva.model.Reserva;
import com.comunicacion.reserva.service.ReservaService;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;


    @PostMapping
    public ResponseEntity<Reserva> postReserva(@RequestBody Reserva reserva) {
        try {
            return new ResponseEntity<>(reservaService.crearReserva(reserva),HttpStatus.OK);
        } catch (Exception e) {
      
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
