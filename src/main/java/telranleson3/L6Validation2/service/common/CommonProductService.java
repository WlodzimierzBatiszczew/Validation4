package telranleson3.L6Validation2.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import telranleson3.L6Validation2.domain.entity.Product;
import telranleson3.L6Validation2.repository.ProductRepository;
import telranleson3.L6Validation2.service.ProductService;

import java.util.List;

public class CommonProductService implements ProductService {
    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public Product getById(int id) {
        return repository.getById(id);
    }

    @Override
    public void add(Product product) {
        repository.add(product.getName(), getTotalPrice());

    }

    @Override
    public void deleteById(int id) {
        repository.delete(id);

    }

    @Override
    public void deleteByName(String name) {
        Product product = repository.getAll().stream().filter(o -> o.getName().equals(name)).findFirst().get();
        repository.delete(product.getId());
    }

    @Override
    public int getCount() {
        return repository.getAll().size();
    }

    @Override
    public double getTotalPrice() {
        return repository.getAll().stream().mapToDouble(x -> x.getPrice()).sum();
    }

    @Override
    public double getAveragePrice() {
        return getTotalPrice() / getCount();
    }
}
