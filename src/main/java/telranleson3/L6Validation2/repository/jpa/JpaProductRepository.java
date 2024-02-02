package telranleson3.L6Validation2.repository.jpa;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import telranleson3.L6Validation2.domain.entity.jpa.JpaProduct;

public interface JpaProductRepository extends JpaRepository<JpaProduct, Integer> {

    @Transactional
    void deleteByName(String name);

    @Query(value = "select sum(price) from product", nativeQuery = true)
    double getTotalPrice();


}
