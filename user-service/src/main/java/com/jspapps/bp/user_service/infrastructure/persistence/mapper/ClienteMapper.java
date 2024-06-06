package com.jspapps.bp.user_service.infrastructure.persistence.mapper;

import com.jspapps.bp.user_service.domain.model.ClienteQuery;
import com.jspapps.bp.user_service.domain.model.CreateUserCommand;
import com.jspapps.bp.user_service.infrastructure.persistence.model.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ClienteMapper {

    public Cliente createUser(CreateUserCommand createUserCommand) {
        Cliente newCliente = new Cliente();
        newCliente.setNombre(createUserCommand.getNombre());
        newCliente.setDireccion(createUserCommand.getDireccion());
        newCliente.setTelefono(createUserCommand.getTelefono());
        newCliente.setPassword(createUserCommand.getContrasena());
        newCliente.setEstado(createUserCommand.getEstado());
        return newCliente;
    }

    public ClienteQuery toQuery(Cliente clienteFound) {
        if (clienteFound == null) {
            return null;
        }

        ClienteQuery clienteQuery = new ClienteQuery();
        clienteQuery.setId(clienteFound.getId());
        clienteQuery.setNombre(clienteFound.getNombre());
        clienteQuery.setDireccion(clienteFound.getDireccion());
        clienteQuery.setTelefono(clienteFound.getTelefono());
        clienteQuery.setContrasena(clienteFound.getPassword());
        clienteQuery.setEstado(clienteFound.getEstado());
        return clienteQuery;
    }
}
