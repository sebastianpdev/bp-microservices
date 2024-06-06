package com.jspapps.bp.account_service.account.infrastructure.persistence.model;

import com.jspapps.bp.account_service.account.domain.constant.AccountType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cuenta")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_cuenta")
    private AccountType accountType;

    @Column(name = "saldo_inicial")
    private Long saldoInicial;

    @Column private Boolean estado;

    @Column(name = "cliente_id")
    private Long clienteId;
}
