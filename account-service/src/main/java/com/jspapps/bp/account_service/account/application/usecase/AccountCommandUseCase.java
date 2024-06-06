package com.jspapps.bp.account_service.account.application.usecase;

import com.jspapps.bp.account_service.account.application.in.IAccountCommandUseCase;
import com.jspapps.bp.account_service.account.domain.event.IAccountEventHandler;
import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.account_service.account.domain.model.CreateAccountCommand;
import com.jspapps.bp.account_service.account.domain.repository.IAccountCommandDAO;
import com.jspapps.bp.account_service.account.infrastructure.util.annotation.UseCase;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class AccountCommandUseCase implements IAccountCommandUseCase {

    private final IAccountEventHandler accountEventHandler;
    private final IAccountCommandDAO accountCommandDAO;

    @Override
    public void createAccount(CreateAccountCommand createAccountCommand) {
        accountEventHandler.validateUser(createAccountCommand);
    }

    @Override
    public void createAccount(AccountVerifiedCommand accountVerifiedCommand) {
        accountCommandDAO.createAccount(accountVerifiedCommand);
    }
}
