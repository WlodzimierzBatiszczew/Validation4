package telranleson3.L6Validation2.service;

import telranleson3.L6Validation2.domain.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAll();
    Client getById(int id);
    void add(Client client);
    void deleteById(int id);
    void deleteByName(String name);
    int getCount();
    double getTotalPriceById(int id);
    double getAveragePriceById(int id);
    void addToBasketById(int clientId, int productId);
    void deleteFromBasket(int clientId, int productId);
    void clearBasket(int clientId);

}
