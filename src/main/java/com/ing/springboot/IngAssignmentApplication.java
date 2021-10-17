package com.ing.springboot;

import com.ing.controllers.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot starter class.
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackageClasses = StudentController.class)
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class IngAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngAssignmentApplication.class, args);
	}

}
