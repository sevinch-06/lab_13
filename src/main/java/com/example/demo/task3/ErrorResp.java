package com.example.demo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;


@Getter
@Setter
public class ErrorResp {
    private String errorCode;
    private LocalDateTime timestamp;
    private Map<String, String> error;

    public ErrorResp(String errorCode, LocalDateTime timestamp, Map<String, String> error) {
        this.errorCode = errorCode;
        this.timestamp = timestamp;
        this.error = error;
    }
}