package lab.webservices.pizza.order;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/1.0")
public class PizzaOrderController {

    PizzaOrderService pizzaOrderService;

    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    @PostMapping("/orders")
    public String createOrder(@RequestBody PizzaOrder pizzaOrder) {
        pizzaOrder.setPrice(pizzaOrder.setOrderPrice());
        pizzaOrderService.save(pizzaOrder);
        return "Order saved";
    }

    @GetMapping("/orders")
    public List<PizzaOrder> getOrders() {
        return pizzaOrderService.getAll();
    }
}
