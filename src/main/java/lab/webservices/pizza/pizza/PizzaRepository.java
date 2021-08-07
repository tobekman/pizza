package lab.webservices.pizza.pizza;


import org.springframework.data.jpa.repository.JpaRepository;


public interface PizzaRepository extends JpaRepository<Pizza, Long> {
    Pizza findPizzaById(Long id);
    void deletePizzaById(Long id);
}
