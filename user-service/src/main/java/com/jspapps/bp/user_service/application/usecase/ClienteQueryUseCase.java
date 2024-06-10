package com.jspapps.bp.user_service.application.usecase;

import com.jspapps.bp.user_service.application.in.IClienteQueryUseCase;
import com.jspapps.bp.user_service.domain.event.IAccountEventHandler;
import com.jspapps.bp.user_service.domain.exception.ClienteServiceErrorMessage;
import com.jspapps.bp.user_service.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.user_service.domain.model.ClienteQuery;
import com.jspapps.bp.user_service.domain.model.CreateAccountCommand;
import com.jspapps.bp.user_service.domain.repository.IClienteQueryDAO;
import com.jspapps.bp.user_service.infrastructure.exception.ClienteServiceException;
import com.jspapps.bp.user_service.infrastructure.util.annotation.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class ClienteQueryUseCase implements IClienteQueryUseCase {

    private final IClienteQueryDAO clienteQueryDAO;

    private final IAccountEventHandler accountEventHandler;

    @Override
    public void validateCliente(CreateAccountCommand createAccountCommand) {
        ClienteQuery clienteQuery = clienteQueryDAO.validateClienteByNombre(createAccountCommand.getCliente());
        if (clienteQuery != null) {
            AccountVerifiedCommand accountVerifiedCommand = new AccountVerifiedCommand();
            accountVerifiedCommand.setId(createAccountCommand.getId());
            accountVerifiedCommand.setNumeroCuenta(createAccountCommand.getNumeroCuenta());
            accountVerifiedCommand.setTipo(createAccountCommand.getTipo());
            accountVerifiedCommand.setSaldoInicial(createAccountCommand.getSaldoInicial());
            accountVerifiedCommand.setEstado(createAccountCommand.getEstado());
            accountVerifiedCommand.setClienteId(clienteQuery.getId());
            accountEventHandler.createAccount(accountVerifiedCommand);
        } else {
            throw new ClienteServiceException(ClienteServiceErrorMessage.CLIENTE_NO_EXISTE);
        }
    }
}
