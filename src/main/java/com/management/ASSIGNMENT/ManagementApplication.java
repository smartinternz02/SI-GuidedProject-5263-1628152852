package com.management.ASSIGNMENT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.management.ASSIGNMENT.Entity.Assignment;
import com.management.ASSIGNMENT.Repository.StudentRepository;

@SpringBootApplication
public class ManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}
	
    @Autowired
    private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
	}
    

}
