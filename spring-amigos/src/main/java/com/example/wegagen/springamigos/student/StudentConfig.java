package com.example.wegagen.springamigos.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return  args -> {
          Student seife=  new Student(

                    "Seife",
                    "Seife.bekele@gmail.com",
                    LocalDate.of(2000, JULY,30)
            );
            Student alex=  new Student(

                    "Alex",
                    "Alex.bekele@gmail.com",
                    LocalDate.of(2004, JULY,30)
            );

            repository.saveAll(
                    List.of(seife,alex)
            );


        };
    }
}
