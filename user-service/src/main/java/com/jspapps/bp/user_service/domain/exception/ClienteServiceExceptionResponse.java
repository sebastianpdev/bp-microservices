package com.jspapps.bp.user_service.domain.exception;

import org.springframework.http.HttpStatus;

public record ClienteServiceExceptionResponse(HttpStatus status, int errorCode, String errorMessage) {
}
