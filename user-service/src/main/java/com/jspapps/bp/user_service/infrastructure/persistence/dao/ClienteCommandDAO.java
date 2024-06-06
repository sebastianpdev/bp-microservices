package com.jspapps.bp.user_service.infrastructure.persistence.dao;

import com.jspapps.bp.user_service.domain.model.CreateUserCommand;
import com.jspapps.bp.user_service.domain.repository.IClienteCommandDAO;
import com.jspapps.bp.user_service.infrastructure.persistence.mapper.ClienteMapper;
import com.jspapps.bp.user_service.infrastructure.persistence.repository.ClienteRepository;
import com.jspapps.bp.user_service.infrastructure.util.annotation.PersistenceAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@PersistenceAdapter
public class ClienteCommandDAO implements IClienteCommandDAO {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    @Override
    public void createCliente(CreateUserCommand createUserCommand) {
        clienteRepository.save(clienteMapper.createUser(createUserCommand));
    }
}
