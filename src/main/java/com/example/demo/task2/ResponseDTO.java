package com.example.demo.task2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDTO {
    @JsonProperty("msg")
    private String message;

    @JsonProperty("status")
    private int status;
}
