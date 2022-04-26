package aine.example.jokes;

import aine.example.jokes.Controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokesApplication.class, args);
	}

}
