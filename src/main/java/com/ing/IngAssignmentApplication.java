package com.ing;

import com.ing.controllers.AdminController;
import com.ing.controllers.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring Boot starter class.
 */
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackageClasses = {StudentController.class, AdminController.class})
// Not exactly sure why it can't scan them
public class IngAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngAssignmentApplication.class, args);
	}

}
