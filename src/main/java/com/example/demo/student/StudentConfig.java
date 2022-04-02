package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.j@gmail.com",
                    LocalDate.of(2000, 05, 10)
            );
            Student alex = new Student(
                    "Alex",
                    "alex.j@gmail.com",
                    LocalDate.of(2004, 05, 10)
            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
