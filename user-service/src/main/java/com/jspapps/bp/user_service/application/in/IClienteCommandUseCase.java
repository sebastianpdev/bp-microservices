package com.jspapps.bp.user_service.application.in;

import com.jspapps.bp.user_service.domain.model.CreateUserCommand;

public interface IClienteCommandUseCase {

    void createUser(CreateUserCommand createUserCommand);
}
