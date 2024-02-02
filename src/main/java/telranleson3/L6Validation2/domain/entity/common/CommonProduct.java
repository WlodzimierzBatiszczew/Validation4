package telranleson3.L6Validation2.domain.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import telranleson3.L6Validation2.domain.entity.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonProduct implements Product {

    private int id;
    private String name;
    private double price;

}
