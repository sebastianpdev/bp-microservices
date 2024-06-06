package com.jspapps.bp.user_service.infrastructure.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
public class Cliente extends Persona {

    @Column private String password;
    @Column private Boolean estado;
}
