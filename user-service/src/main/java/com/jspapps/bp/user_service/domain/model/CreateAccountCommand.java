package com.jspapps.bp.user_service.domain.model;

import com.jspapps.bp.user_service.domain.constant.AccountType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateAccountCommand extends BaseCommand {

    public CreateAccountCommand() {
        super();
    }

    private String numeroCuenta;
    private AccountType tipo;
    private Long saldoInicial;
    private Boolean estado;
    private String cliente;
}
