package com.jspapps.bp.user_service.domain.model;

import lombok.Data;

@Data
public class ClienteQuery {

    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String contrasena;
    private Boolean estado;

}
