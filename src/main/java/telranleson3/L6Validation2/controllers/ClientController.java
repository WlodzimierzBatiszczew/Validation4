package telranleson3.L6Validation2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import telranleson3.L6Validation2.domain.entity.Client;
import telranleson3.L6Validation2.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
@Autowired
    private ClientService service;
    @GetMapping
     public List<Client> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Client getById(@PathVariable int id){
        return service.getById(id);
    }
}
