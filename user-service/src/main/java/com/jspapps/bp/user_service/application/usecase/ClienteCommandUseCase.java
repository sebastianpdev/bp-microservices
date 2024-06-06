package com.jspapps.bp.user_service.application.usecase;

import com.jspapps.bp.user_service.application.in.IClienteCommandUseCase;
import com.jspapps.bp.user_service.domain.model.CreateUserCommand;
import com.jspapps.bp.user_service.domain.repository.IClienteCommandDAO;
import com.jspapps.bp.user_service.infrastructure.util.annotation.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class ClienteCommandUseCase implements IClienteCommandUseCase {

    private final IClienteCommandDAO createClienteDAO;

    @Override
    public void createUser(CreateUserCommand createUserCommand) {
        createClienteDAO.createCliente(createUserCommand);
    }
}
