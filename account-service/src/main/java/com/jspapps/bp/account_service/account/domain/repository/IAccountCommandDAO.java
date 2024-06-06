package com.jspapps.bp.account_service.account.domain.repository;

import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;

public interface IAccountCommandDAO {

    void createAccount(AccountVerifiedCommand accountVerifiedCommand);
}
