package telranleson3.L6Validation2.domain.entity;

import java.util.List;

public interface Basket {

    double getTotalCost();

    void addProduct(Product product);
    List<Product> getProducts();


}
