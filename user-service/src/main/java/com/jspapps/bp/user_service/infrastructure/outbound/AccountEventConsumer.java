package com.jspapps.bp.user_service.infrastructure.outbound;

import com.jspapps.bp.user_service.application.in.IClienteQueryUseCase;
import com.jspapps.bp.user_service.domain.model.CreateAccountCommand;
import com.jspapps.bp.user_service.infrastructure.util.constant.AppConstant;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountEventConsumer {

    private final IClienteQueryUseCase clienteQueryUseCase;


    @KafkaListener(topics = "createAccountCommand", groupId = AppConstant.KAFKA_GROUP, containerFactory = "listenerContainerFactory")
    public void consume(CreateAccountCommand createAccountCommand, Acknowledgment ack) {
        clienteQueryUseCase.validateCliente(createAccountCommand);
        ack.acknowledge();
    }

}
