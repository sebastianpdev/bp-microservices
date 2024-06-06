package com.jspapps.bp.account_service.account.infrastructure.outbound;

import com.jspapps.bp.account_service.account.domain.event.IAccountEventHandler;
import com.jspapps.bp.account_service.account.domain.model.BaseCommand;
import com.jspapps.bp.account_service.account.domain.model.CreateAccountCommand;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AccountEventHandler implements IAccountEventHandler {

    private final KafkaTemplate<String, BaseCommand> kafkaTemplate;

    @Override
    public void validateUser(CreateAccountCommand createAccountCommand) {
        kafkaTemplate.send("createAccountCommand", createAccountCommand);
    }
}
