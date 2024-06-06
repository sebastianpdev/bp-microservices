package com.jspapps.bp.user_service.domain.repository;

import com.jspapps.bp.user_service.domain.model.CreateUserCommand;

public interface IClienteCommandDAO {

    void createCliente(CreateUserCommand createUserCommand);

}
