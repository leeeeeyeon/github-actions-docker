package com.example.demo.model.dto;

import com.example.demo.model.Hello;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class HelloRequestDto {
    private String text;

    @Builder
    private HelloRequestDto(String text) {
        this.text = text;
    }
}
