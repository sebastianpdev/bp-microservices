package com.jspapps.bp.user_service.domain.event;

import com.jspapps.bp.user_service.domain.model.AccountVerifiedCommand;

public interface IAccountEventHandler {

    void createAccount(AccountVerifiedCommand accountVerifiedCommand);
}
