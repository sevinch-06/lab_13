package com.example.demo.task3;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class task3Controller {
    @PostMapping("/submit")
    public ResponseEntity<String> submitData(@Valid @RequestBody RequestDTO requestDTO) {
        return ResponseEntity.ok("Data submitted successfully");
}
}
