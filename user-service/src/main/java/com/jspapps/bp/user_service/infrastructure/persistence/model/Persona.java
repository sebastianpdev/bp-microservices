package com.jspapps.bp.user_service.infrastructure.persistence.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column private String nombre;

    @Column private String genero;

    @Column private String direccion;

    @Column private String telefono;
}
