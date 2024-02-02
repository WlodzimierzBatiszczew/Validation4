package telranleson3.L6Validation2.domain.database;

import java.sql.SQLException;
import java.util.List;

public interface Database {
    void execute(String query) throws SQLException;
    List<Object> select(String query) throws SQLException;

}
