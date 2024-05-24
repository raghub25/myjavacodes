package com.springboot.demo.crudrestdemo.exception;

import com.springboot.demo.crudrestdemo.model.EmployeeErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException (EmployeeNotFoundException ex) {
        EmployeeErrorResponse resp = new EmployeeErrorResponse();
        resp.setStatus(HttpStatus.NOT_FOUND.value());
        resp.setMessage(ex.getMessage());
        resp.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException (Exception ex) {
        EmployeeErrorResponse resp = new EmployeeErrorResponse();
        resp.setStatus(HttpStatus.BAD_REQUEST.value());
        resp.setMessage(ex.getMessage());
        resp.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
    }
}
