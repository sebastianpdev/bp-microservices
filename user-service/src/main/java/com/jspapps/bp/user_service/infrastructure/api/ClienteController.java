package com.jspapps.bp.user_service.infrastructure.api;

import com.jspapps.bp.user_service.application.in.IClienteCommandUseCase;
import com.jspapps.bp.user_service.domain.model.CreateUserCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private IClienteCommandUseCase clienteCommandUseCase;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void crearCliente(@RequestBody CreateUserCommand createUserCommand) {
        clienteCommandUseCase.createUser(createUserCommand);
    }





}
