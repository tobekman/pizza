package lab.webservices.pizza.entities;

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

    private int price;


}
