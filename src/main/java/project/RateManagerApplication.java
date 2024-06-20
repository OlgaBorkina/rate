package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RateManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateManagerApplication.class, args);
	}

}
