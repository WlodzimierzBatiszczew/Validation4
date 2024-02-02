package telranleson3.L6Validation2.domain.entity.jpa;

import jakarta.persistence.*;
import telranleson3.L6Validation2.domain.entity.Basket;
import telranleson3.L6Validation2.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "basket")
public class JpaBasket implements Basket {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne
    @JoinColumn(name = "client_id")
    private JpaClient client;

    @ManyToMany
    @JoinTable(
            name = "basket_product",
            joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<JpaProduct> products;


    @Override
    public double getTotalCost() {
        return products.stream().mapToDouble(x -> x.getPrice()).sum();
    }

    @Override
    public void addProduct(Product product) {
        products.add(new JpaProduct(product.getId(), product.getName(), product.getPrice()));

    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
