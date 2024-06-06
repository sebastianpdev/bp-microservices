package com.jspapps.bp.account_service.account.infrastructure.persistence.repository;

import com.jspapps.bp.account_service.account.infrastructure.persistence.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
