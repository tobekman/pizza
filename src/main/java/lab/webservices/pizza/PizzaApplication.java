package lab.webservices.pizza;

import lab.webservices.pizza.entities.Pizza;
import lab.webservices.pizza.repositories.PizzaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class PizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(PizzaRepository pizzaRepository) {
        return args -> {

            //add data to database or configurations and stuff

        };
    }

}
