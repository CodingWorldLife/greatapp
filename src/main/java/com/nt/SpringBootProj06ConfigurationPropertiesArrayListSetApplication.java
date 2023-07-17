package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class SpringBootProj06ConfigurationPropertiesArrayListSetApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProj06ConfigurationPropertiesArrayListSetApplication.class, args);
	Employee employee =ctx.getBean("employee",Employee.class);
	System.out.println(employee);
	}

}
