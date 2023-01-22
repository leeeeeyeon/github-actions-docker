package com.example.demo.service;

import com.example.demo.model.Hello;
import com.example.demo.model.dto.HelloRequestDto;
import com.example.demo.repository.HelloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {
    private final HelloRepository helloRepository;

    public String getHello(Long id) {
        Hello hello = helloRepository.getHelloById(id);
        return hello.getText();
    }

    public Long postHello(HelloRequestDto helloRequestDto) {
        String text = helloRequestDto.getText();
        return helloRepository.save(helloRepository.save(Hello.toEntity(text))).getId();
    }
}
