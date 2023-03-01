package com.sala78.upcommingevents;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sala78.upcommingevents.models.Role;
import com.sala78.upcommingevents.models.User;
import com.sala78.upcommingevents.repositories.RolesRepository;
import com.sala78.upcommingevents.repositories.UserRepository;

@SpringBootApplication
public class UpcommingEventsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpcommingEventsApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(UserRepository users,RolesRepository roles, PasswordEncoder encoder) {
		return args -> {
			Role theRole = new Role(null, "ROLE_USER");
			

			roles.save(theRole);
			User userToAdd = new User(null, "user",encoder.encode("password"));
			userToAdd.setRoles(theRole);
			users.save(userToAdd);
			users.save(new User(null, "admin",encoder.encode("password")));

		};
	}
}
