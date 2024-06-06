package com.jspapps.bp.user_service.application.in;

import com.jspapps.bp.user_service.domain.model.CreateAccountCommand;

public interface IClienteQueryUseCase {

    void validateCliente(CreateAccountCommand createAccountCommand);
}
