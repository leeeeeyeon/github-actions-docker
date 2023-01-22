package com.example.demo.controller;

import com.example.demo.model.dto.HelloRequestDto;
import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {
    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/{id}")
    public String getHello(@PathVariable("id") Long id) {
        return helloService.getHello(id);
    }

    @PostMapping("/hello")
    public Long postHello(@RequestBody HelloRequestDto helloRequestDto) {
        return helloService.postHello(helloRequestDto);
    }
}
