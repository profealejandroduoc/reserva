// model/ClienteDTO.java
package com.comunicacion.reserva.model;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long idCliente;
    private String nombre;
    private String apellido;
    private String correo;
}
