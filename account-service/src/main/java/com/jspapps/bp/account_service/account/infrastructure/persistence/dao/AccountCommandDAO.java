package com.jspapps.bp.account_service.account.infrastructure.persistence.dao;

import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.account_service.account.domain.repository.IAccountCommandDAO;
import com.jspapps.bp.account_service.account.infrastructure.persistence.mapper.AccountMapper;
import com.jspapps.bp.account_service.account.infrastructure.persistence.repository.AccountRepository;
import com.jspapps.bp.account_service.account.infrastructure.util.annotation.PersistenceAdapter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@PersistenceAdapter
public class AccountCommandDAO implements IAccountCommandDAO {

    private final AccountMapper accountMapper;
    private final AccountRepository accountRepository;

    @Override
    public void createAccount(AccountVerifiedCommand accountVerifiedCommand) {
        accountRepository.save(accountMapper.toModel(accountVerifiedCommand));
    }
}
