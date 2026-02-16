package com.project.kodnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionUsingFieldApplication {

	public static void main(String[] args) {
		ApplicationContext  ac =SpringApplication.run(DependencyInjectionUsingFieldApplication.class, args);
		Student st = ac.getBean(Student.class);
		st.study();
		st.useLaptop();
	}

}
