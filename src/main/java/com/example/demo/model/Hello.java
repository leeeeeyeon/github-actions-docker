package com.example.demo.model;

import com.example.demo.model.dto.HelloRequestDto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hello {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String text;

    @Builder(access = AccessLevel.PRIVATE)
    private Hello(String text) {
        this.text = text;
    }

    public static Hello toEntity(String text) {
        return Hello.builder()
            .text(text)
            .build();
    }
}
