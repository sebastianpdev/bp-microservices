package com.jspapps.bp.account_service.account.domain.model;

import lombok.Data;

@Data
public class AccountVerifiedCommand extends CreateAccountCommand {

    private Long clienteId;
}
