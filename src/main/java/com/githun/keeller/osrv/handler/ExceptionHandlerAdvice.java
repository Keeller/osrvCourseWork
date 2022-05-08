package com.githun.keeller.osrv.handler;

import com.githun.keeller.osrv.model.dto.ExceptionResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ExceptionResponseDto> processException(Throwable th) {
        return ResponseEntity.status(500)
                .body(ExceptionResponseDto.builder()
                        .msg(th.getMessage())
                        .build());
    }
}
