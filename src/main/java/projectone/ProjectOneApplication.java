package projectone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projectone.model.User;
import projectone.repository.UserRepository;

@SpringBootApplication
public class ProjectOneApplication {

	private static final Logger log = LoggerFactory.getLogger(ProjectOneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjectOneApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new User("Jack"));
			repository.save(new User("Chloe"));
			repository.save(new User("Kim"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");
		};
	}
}
