// model/Reserva.java
package com.comunicacion.reserva.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;

    @Column(nullable = false)
    private int mesa;

    @Column(nullable = false)
    private Long idCliente;
    
    @Column(nullable = false, length = 250)
    private String correoCliente;
}
