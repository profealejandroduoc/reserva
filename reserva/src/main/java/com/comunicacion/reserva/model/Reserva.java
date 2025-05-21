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
    private int mesa;
    private Long idCliente;
    private String correoCliente;
}
