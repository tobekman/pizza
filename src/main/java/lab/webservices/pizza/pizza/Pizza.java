package lab.webservices.pizza.pizza;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Pizza {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String toppings;

    private int price;


}
