package com.example.demo.repository;

import com.example.demo.model.Hello;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long> {
    Hello getHelloById(Long id);

}
