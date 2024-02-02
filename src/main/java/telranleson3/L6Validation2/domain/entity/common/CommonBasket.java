package telranleson3.L6Validation2.domain.entity.common;

import telranleson3.L6Validation2.domain.entity.Basket;
import telranleson3.L6Validation2.domain.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class CommonBasket implements Basket {

    private List<Product> products = new ArrayList<>();


    @Override
    public double getTotalCost() {
        return products.stream().mapToDouble(x -> x.getPrice()).sum();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
