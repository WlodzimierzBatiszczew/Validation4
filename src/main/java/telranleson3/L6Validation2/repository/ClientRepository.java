package telranleson3.L6Validation2.repository;

import telranleson3.L6Validation2.domain.entity.Client;

import java.util.List;

public interface ClientRepository {
    Client findById(int id);
    List<Client> getClients();
    void deleteById(int id);
    void addClient(String name);
}
