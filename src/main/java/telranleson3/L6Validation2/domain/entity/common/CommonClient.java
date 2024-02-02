package telranleson3.L6Validation2.domain.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import telranleson3.L6Validation2.domain.entity.Basket;
import telranleson3.L6Validation2.domain.entity.Client;

@Data
@AllArgsConstructor
public class CommonClient implements Client {

    private int id;
    private String name;
    private Basket basket;

}
