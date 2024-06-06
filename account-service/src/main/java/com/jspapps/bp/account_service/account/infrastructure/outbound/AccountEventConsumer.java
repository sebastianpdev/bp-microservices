package com.jspapps.bp.account_service.account.infrastructure.outbound;

import com.jspapps.bp.account_service.account.application.in.IAccountCommandUseCase;
import com.jspapps.bp.account_service.account.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.account_service.account.infrastructure.util.constant.AppConstant;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountEventConsumer {

    private final IAccountCommandUseCase accountUseCase;

    @KafkaListener(topics = "accountVerifiedCommand", groupId = AppConstant.KAFKA_GROUP, containerFactory = "listenerContainerFactory")
    public void consume(AccountVerifiedCommand accountVerifiedCommand, Acknowledgment ack) {
        accountUseCase.createAccount(accountVerifiedCommand);
        ack.acknowledge();
    }
}
