package com.jspapps.bp.account_service.account.domain.model;

import com.jspapps.bp.account_service.account.domain.constant.AccountType;
import lombok.Data;

@Data
public class CreateAccountCommand extends BaseCommand {

    private String numeroCuenta;
    private AccountType tipo;
    private Long saldoInicial;
    private Boolean estado;
    private String cliente;
}
