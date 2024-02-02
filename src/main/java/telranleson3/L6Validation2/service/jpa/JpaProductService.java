package telranleson3.L6Validation2.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import telranleson3.L6Validation2.domain.entity.Product;
import telranleson3.L6Validation2.domain.entity.jpa.JpaProduct;
import telranleson3.L6Validation2.repository.jpa.JpaProductRepository;
import telranleson3.L6Validation2.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class JpaProductService implements ProductService {

    @Autowired
    private JpaProductRepository repository;

    @Override
    public List<Product> getAll() {
        return new ArrayList<>(repository.findAll());
    }

    @Override
    public Product getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void add(Product product) {
        repository.save(new JpaProduct(0, product.getName(), product.getPrice()));

    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);

    }

    @Override
    public void deleteByName(String name) {
        repository.deleteByName(name);

    }

    @Override
    public int getCount() {
        return (int) repository.count();
    }

    @Override
    public double getTotalPrice() {
        return repository.getTotalPrice();
    }

    @Override
    public double getAveragePrice() {
        return 0;
    }
}
