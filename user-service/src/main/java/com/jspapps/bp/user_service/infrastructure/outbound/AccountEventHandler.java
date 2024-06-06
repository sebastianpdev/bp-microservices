package com.jspapps.bp.user_service.infrastructure.outbound;

import com.jspapps.bp.user_service.domain.event.IAccountEventHandler;
import com.jspapps.bp.user_service.domain.model.AccountVerifiedCommand;
import com.jspapps.bp.user_service.domain.model.BaseCommand;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AccountEventHandler implements IAccountEventHandler {

    private final KafkaTemplate<String, BaseCommand> kafkaTemplate;

    @Override
    public void createAccount(AccountVerifiedCommand accountVerifiedCommand) {
        kafkaTemplate.send("accountVerifiedCommand", accountVerifiedCommand);
    }
}
