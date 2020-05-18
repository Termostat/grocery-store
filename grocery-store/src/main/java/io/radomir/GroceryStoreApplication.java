package io.radomir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GroceryStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryStoreApplication.class, args);
	}

}
