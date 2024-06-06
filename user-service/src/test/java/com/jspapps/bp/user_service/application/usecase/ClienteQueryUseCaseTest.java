package com.jspapps.bp.user_service.application.usecase;

import com.jspapps.bp.user_service.domain.constant.AccountType;
import com.jspapps.bp.user_service.domain.event.IAccountEventHandler;
import com.jspapps.bp.user_service.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.user_service.domain.model.ClienteQuery;
import com.jspapps.bp.user_service.domain.model.CreateAccountCommand;
import com.jspapps.bp.user_service.domain.repository.IClienteQueryDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClienteQueryUseCaseTest {


    @InjectMocks
    private ClienteQueryUseCase underTestClienteQueryUseCase;

    @Mock
    private IClienteQueryDAO clienteQueryDAO;

    @Mock
    private IAccountEventHandler accountEventHandler;

    @BeforeEach
    void init() {
    }

    private CreateAccountCommand generateCreateAccountExpected() {
        CreateAccountCommand createAccountCommand = new CreateAccountCommand();
        createAccountCommand.setNumeroCuenta("123");
        createAccountCommand.setCliente("pepe");
        createAccountCommand.setTipo(AccountType.Ahorros);
        createAccountCommand.setSaldoInicial(100L);
        createAccountCommand.setEstado(true);
        return createAccountCommand;
    }

    @Test
    void givenCreateAccountCommandRequest_thenCreateAccountSuccessful() {
        CreateAccountCommand createAccountCommand = generateCreateAccountExpected();

        ClienteQuery clienteRecord = new ClienteQuery();
        clienteRecord.setId(1L);
        clienteRecord.setNombre("pepe");

        when(clienteQueryDAO.validateClienteByNombre(createAccountCommand.getCliente())).thenReturn(clienteRecord);
        doNothing().when(accountEventHandler).createAccount(any(AccountVerifiedCommand.class));

        underTestClienteQueryUseCase.validateCliente(createAccountCommand);

        verify(clienteQueryDAO, times(1)).validateClienteByNombre(createAccountCommand.getCliente());
        assertEquals(createAccountCommand.getCliente(), clienteRecord.getNombre());
    }
}
