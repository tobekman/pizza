package lab.webservices.pizza.order;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PizzaOrderService {

    PizzaOrderRepository pizzaOrderRepository;

    public PizzaOrderService(PizzaOrderRepository pizzaOrderRepository) {
        this.pizzaOrderRepository = pizzaOrderRepository;
    }

    public PizzaOrder save(PizzaOrder pizzaOrder) {
        return pizzaOrderRepository.save(pizzaOrder);
    }

    public List<PizzaOrder> getAll() {
        return pizzaOrderRepository.findAll();
    }

    public PizzaOrder getById(Long id) {
        return pizzaOrderRepository.findOrderById(id);
    }


}
