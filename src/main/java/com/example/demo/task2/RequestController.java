package com.example.demo.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class RequestController {

    @GetMapping("/response")
    public RequestWrapper<ResponseDTO> getResponse() {
        ResponseDTO responseDTO = new ResponseDTO("Success", 200);
        return new RequestWrapper<>(
                "Request successful",
                200,
                responseDTO,
                LocalDateTime.now()
        );
    }
}
