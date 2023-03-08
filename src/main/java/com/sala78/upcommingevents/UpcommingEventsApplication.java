package com.sala78.upcommingevents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.repositories.RolesRepository;
import com.sala78.upcommingevents.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpcommingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpcommingEventsApplication.class, args);
	}
}
