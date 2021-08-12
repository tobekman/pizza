package lab.webservices.pizza.order;

import lab.webservices.pizza.pizza.Pizza;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customer;

    @OneToMany
    private List<Pizza> pizzas;

    private double price;

    public double setOrderPrice() {
        double price = 0;
        for (Pizza pizza : pizzas) {
            price += pizza.getPrice();
        }
        return price;
    }



}
