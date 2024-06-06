package com.jspapps.bp.user_service.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountVerifiedCommand extends CreateAccountCommand {

    public AccountVerifiedCommand() {
        super();
    }

    private Long clienteId;

}
