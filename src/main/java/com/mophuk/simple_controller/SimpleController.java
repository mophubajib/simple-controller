package com.mophuk.simple_controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class SimpleController {

    @GetMapping("/")
    public SimpleResponse getSimpleResponseWithParam(@RequestParam String param) {

        return new SimpleResponse(param);
    }

    @GetMapping("/{variable}")
    public SimpleResponse getSimpleResponseWithPathVariable(@PathVariable String variable) {

        return new SimpleResponse(variable);
    }

    @PostMapping("/")
    public SimpleResponse getSimpleResponseWithPathVariable(@RequestBody SimpleRequest request) {

        return new SimpleResponse(request.getValue());
    }

    @PostConstruct
    private void testSout() {

        System.out.println("This is version 0.0.1");
    }
}
