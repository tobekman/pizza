package lab.webservices.pizza.controllers;

import lab.webservices.pizza.entities.Pizza;
import lab.webservices.pizza.repositories.PizzaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
class PizzaControllerTest {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Test
    void postPizzaIsSavedToDB() {
        Pizza pizza = createPizza();
        pizzaRepository.save(pizza);
        List<Pizza> pizzasFromDB = pizzaRepository.findAll();

        assertThat(pizzasFromDB).contains(pizza);
    }

    @Test
    void deletePizza() {
        Pizza pizza = createPizza();
        pizzaRepository.save(pizza);
        pizzaRepository.deletePizzaById(2L);
        List<Pizza> pizzaFromDB = pizzaRepository.findAll();

        assertThat(pizzaFromDB).isEmpty();
    }

    Pizza createPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaii");
        pizza.setToppings("Tomatsås, ost, skinka, ananas");
        pizza.setPrice(70);
        return pizza;
    }

}