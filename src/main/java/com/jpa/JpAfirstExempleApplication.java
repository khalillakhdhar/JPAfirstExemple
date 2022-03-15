package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.model.EmployeeModel;
import com.jpa.service.EmployeeService;

@SpringBootApplication
public class JpAfirstExempleApplication implements CommandLineRunner {
	@Autowired
	EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(JpAfirstExempleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeModel emp = new EmployeeModel("teste", 30, "mail", "pass", "nom", "prenom", "2022", "20999888", 2000,
				"aucun", "teste");
		service.create(emp);

	}

}
