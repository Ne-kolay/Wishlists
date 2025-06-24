package com.example.Wishlists;

import com.example.Wishlists.User.User;
import com.example.Wishlists.User.JdbcUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class WishlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishlistApplication.class, args);
	}

	@Bean
	public CommandLineRunner launchTest(JdbcUserRepository userRepository) {
		return args -> {
			Optional<User> user = userRepository.findById(9L);
			if (!user.isEmpty()) {
				System.out.println(user.get().getUsername());
			}
		};
	}
}
