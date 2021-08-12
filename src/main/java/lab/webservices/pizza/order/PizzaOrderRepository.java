package lab.webservices.pizza.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

    PizzaOrder findOrderById(Long id);

}
