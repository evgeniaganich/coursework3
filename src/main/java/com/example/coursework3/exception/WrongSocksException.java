package com.example.coursework3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class WrongSocksException extends RuntimeException{
    public WrongSocksException(String message) {
        super(message);
    }
}

