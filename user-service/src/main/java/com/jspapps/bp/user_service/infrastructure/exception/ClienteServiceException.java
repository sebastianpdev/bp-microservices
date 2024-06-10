package com.jspapps.bp.user_service.infrastructure.exception;

import com.jspapps.bp.user_service.domain.exception.ClienteServiceErrorMessage;
import lombok.Getter;

@Getter
public class ClienteServiceException extends RuntimeException {

    private final ClienteServiceErrorMessage errorMessage;

    public ClienteServiceException(ClienteServiceErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }

}
