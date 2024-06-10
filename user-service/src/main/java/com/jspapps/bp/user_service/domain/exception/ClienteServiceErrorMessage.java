package com.jspapps.bp.user_service.domain.exception;

import lombok.Getter;

@Getter
public enum ClienteServiceErrorMessage {
    CLIENTE_NO_EXISTE(1001, "Cliente no existe");

    private final int code;
    private final String message;

    ClienteServiceErrorMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
