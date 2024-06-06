package com.jspapps.bp.account_service.account.application.in;

import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.account_service.account.domain.model.CreateAccountCommand;

public interface IAccountCommandUseCase {

    void createAccount(CreateAccountCommand createAccountCommand);
    void createAccount(AccountVerifiedCommand accountVerifiedCommand);
}
