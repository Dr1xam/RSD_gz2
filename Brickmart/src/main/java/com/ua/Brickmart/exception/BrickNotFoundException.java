package com.ua.Brickmart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BrickNotFoundException extends RuntimeException {
    public BrickNotFoundException(Long id) {
        super("Цеглину з id=" + id + " не знайдено");
    }
}
