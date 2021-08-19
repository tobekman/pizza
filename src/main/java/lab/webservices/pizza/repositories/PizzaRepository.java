package lab.webservices.pizza.repositories;


import lab.webservices.pizza.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    Pizza findPizzaById(Long id);
    void deletePizzaById(Long id);
    List<Pizza> findPizzasByToppingsContains(String topping);
    List<Pizza> findPizzasByPriceBefore(int price);
    List<Pizza> findPizzasByPriceAfter(int price);
}
