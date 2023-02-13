package com.apiappln.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {

        return args -> {

            Student haja;
            haja = new Student(
                           "Haja",
                            "haja@yahoo.com",
                     LocalDate.of(2004,1, 5 )




            );
            Student kiyas = new Student(
                    "kiyas",
                    "kiyas@yahoo.com",
                    LocalDate.of(2004,2, 20 )


            );

            studentRepository.saveAll(
                List.of(haja,kiyas)
        );

        };

    }

}
