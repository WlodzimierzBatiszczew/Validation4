package telranleson3.L6Validation2.repository;

import telranleson3.L6Validation2.domain.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product getById(int id);
    void add(String name, double price);
    void delete(int id);
}
