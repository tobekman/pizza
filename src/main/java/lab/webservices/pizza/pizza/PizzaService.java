package lab.webservices.pizza.pizza;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PizzaService {

    PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }

    public Pizza getById(Long id) {
        return pizzaRepository.findPizzaById(id);
    }

    public void delete(Long id) {
        pizzaRepository.deletePizzaById(id);
    }


}
