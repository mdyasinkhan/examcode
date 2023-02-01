package com.exam.exambackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ExambackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExambackendApplication.class, args);
	}

}
