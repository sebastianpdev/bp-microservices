package com.jspapps.bp.account_service.account.domain.event;

import com.jspapps.bp.account_service.account.domain.model.CreateAccountCommand;

public interface IAccountEventHandler {

    void validateUser(CreateAccountCommand createAccountCommand);
}
