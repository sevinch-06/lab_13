package com.example.demo.task1;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
public class RequestDTO {
    @NotNull(message = "name cannot be empty")
    @Size(min = 2, max = 100, message = "limit up to 50 chars")
    private String name;

    @NotNull(message = "age cannot be empty")
    private int age;


}