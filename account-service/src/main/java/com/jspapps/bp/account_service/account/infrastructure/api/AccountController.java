package com.jspapps.bp.account_service.account.infrastructure.api;

import com.jspapps.bp.account_service.account.application.in.IAccountCommandUseCase;
import com.jspapps.bp.account_service.account.domain.model.CreateAccountCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/cuentas")
public class AccountController {

    private final IAccountCommandUseCase accountCommandUseCase;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createAccount(@RequestBody CreateAccountCommand createAccountCommand) {
        accountCommandUseCase.createAccount(createAccountCommand);
        return ResponseEntity.ok().build();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> getAccount(@PathVariable("id") Long id) {

        return ResponseEntity.ok().build();
    }

}
