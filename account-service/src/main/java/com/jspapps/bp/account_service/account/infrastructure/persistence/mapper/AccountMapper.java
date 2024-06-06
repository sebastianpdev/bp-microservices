package com.jspapps.bp.account_service.account.infrastructure.persistence.mapper;

import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.account_service.account.infrastructure.persistence.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public Account toModel(AccountVerifiedCommand accountVerifiedCommand) {
        Account account = new Account();
        account.setNumeroCuenta(accountVerifiedCommand.getNumeroCuenta());
        account.setAccountType(accountVerifiedCommand.getTipo());
        account.setClienteId(accountVerifiedCommand.getClienteId());
        account.setSaldoInicial(accountVerifiedCommand.getSaldoInicial());
        account.setEstado(accountVerifiedCommand.getEstado());
        return account;
    }
}
