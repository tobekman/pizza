package lab.webservices.pizza.pizza;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/1.0")
public class PizzaController {

    PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping("pizzas")
    public String createPizza(@RequestBody Pizza pizza) {
        pizzaService.save(pizza);
        return "Pizza saved";
    }

    @GetMapping("pizzas")
    public List<Pizza> getPizzas() {
        return pizzaService.getAll();
    }

    @GetMapping("pizzas/{id}")
    public Pizza getPizza(@PathVariable("id") Long id) {
        return pizzaService.getById(id);
    }

    @DeleteMapping("pizzas/{id}")
    public String deletePizza(@PathVariable("id") Long id) {
        pizzaService.delete(id);
        return "Pizza deleted";
    }

    @PutMapping("pizzas")
    public String updatePizza(@RequestBody Pizza pizza) {
        pizzaService.save(pizza);
        return "Pizza updated";
    }


}
