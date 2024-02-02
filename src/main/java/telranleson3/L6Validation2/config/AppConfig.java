package telranleson3.L6Validation2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import telranleson3.L6Validation2.domain.database.CommonDatabase;
import telranleson3.L6Validation2.domain.database.Database;
import telranleson3.L6Validation2.repository.ClientRepository;
import telranleson3.L6Validation2.repository.ProductRepository;
import telranleson3.L6Validation2.repository.common.CommonClientRepository;
import telranleson3.L6Validation2.repository.common.CommonProductRepository;
import telranleson3.L6Validation2.service.ClientService;
import telranleson3.L6Validation2.service.ProductService;
import telranleson3.L6Validation2.service.common.CommonClientService;
import telranleson3.L6Validation2.service.common.CommonProductService;

@Configuration
public class AppConfig {
    @Bean
    public Database database() {

        return new CommonDatabase();
    }

    @Bean
    public ClientService clientService() {
        return new CommonClientService();
    }

    @Bean
    public ProductService productService() {
        return new CommonProductService();
    }

    @Bean
    public ClientRepository clientRepository() {
        return new CommonClientRepository();
    }

    @Bean
    public ProductRepository productRepository() {
        return new CommonProductRepository();
    }

}
