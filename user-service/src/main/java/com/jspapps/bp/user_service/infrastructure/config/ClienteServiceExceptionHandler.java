package com.jspapps.bp.user_service.infrastructure.config;

import com.jspapps.bp.user_service.domain.exception.ClienteServiceExceptionResponse;
import com.jspapps.bp.user_service.infrastructure.exception.ClienteServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ClienteServiceExceptionHandler {

    @ExceptionHandler(ClienteServiceException.class)
    public ResponseEntity<?> handlerClienteServiceException(ClienteServiceException exception) {
        ClienteServiceExceptionResponse exceptionResponse = new ClienteServiceExceptionResponse(
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getErrorMessage().getCode(),
                exception.getErrorMessage().getMessage()
        );
        log.error("ClienteServiceExceptionHandler::handlerClienteServiceException exception caught {}", exception.getMessage());
        return ResponseEntity.internalServerError().body(exceptionResponse);
    }
}
