package telranleson3.L6Validation2.domain.entity.jpa;

import jakarta.persistence.*;
import telranleson3.L6Validation2.domain.entity.Basket;
import telranleson3.L6Validation2.domain.entity.Client;

@Entity
@Table(name = "client")
public class JpaClient implements Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "client")
    private JpaBasket basket;

    public JpaClient() {
    }

    public JpaClient(int id, String name, JpaBasket basket) {
        this.id = id;
        this.name = name;
        this.basket = basket;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Basket getBasket() {
        return basket;
    }
}
