package com.comunicacion.reserva.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.comunicacion.reserva.model.ClienteDTO;
import com.comunicacion.reserva.model.Reserva;
import com.comunicacion.reserva.repository.ReservaRepository;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Reserva crearReserva(Reserva reserva) {
        // Llamada al microservicio cliente
        String url = "http://localhost:8081/api/clientes/" + reserva.getIdCliente();
        ClienteDTO cliente = restTemplate.getForObject(url, ClienteDTO.class);
        if (cliente != null) {
            reserva.setCorreoCliente(cliente.getCorreo());
        }
        return reservaRepository.save(reserva);
    }
}
