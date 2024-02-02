package telranleson3.L6Validation2.repository.common;

import org.springframework.beans.factory.annotation.Autowired;
import telranleson3.L6Validation2.domain.database.Database;
import telranleson3.L6Validation2.domain.entity.Client;
import telranleson3.L6Validation2.repository.ClientRepository;

import java.sql.SQLException;
import java.util.List;

public class CommonClientRepository implements ClientRepository {
    @Autowired
    private Database database;
    @Override
    public Client findById(int id) {
        try {
          return  (Client) database.select("Select client where id = " + id).get(0);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Client> getClients() {
        try {
            List<Object> selectAllClients = database.select("Select all clients");
            return selectAllClients.stream().map(o -> (Client)o).toList();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            database.execute("Delete client where id = " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void addClient(String name) {
        try {
            database.execute("Add client name = " + name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
