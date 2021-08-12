package lab.webservices.pizza.pizza;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String toppings;

    private double price;


}
