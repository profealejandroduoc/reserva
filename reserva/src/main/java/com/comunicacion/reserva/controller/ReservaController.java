// controller/ReservaController.java
package com.comunicacion.reserva.controller;


import org.springframework.web.bind.annotation.*;

import com.comunicacion.reserva.model.Reserva;
import com.comunicacion.reserva.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return service.crearReserva(reserva);
    }
}
