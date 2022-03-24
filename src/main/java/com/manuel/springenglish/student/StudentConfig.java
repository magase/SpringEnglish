package com.manuel.springenglish.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Manuel =new Student("Manuel", "magase98@gmail.com", LocalDate.of(1998, Month.FEBRUARY, 12));
            Student Sandra =new Student("Sandra", "sandra@gmail.com", LocalDate.of(1998, Month.DECEMBER, 16));
            Student Alex =  new Student("Alex", "alex@gmail.com", LocalDate.of(2000, Month.JULY, 5));

            repository.saveAll(
                    List.of(Manuel, Sandra, Alex)
            );
        };
    }
}
