package com19.midterm.cs208midterm;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class DatalarNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(DatalarNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String notFound(DatalarNotFoundException ex) {
        return ex.getMessage();
    }

}
