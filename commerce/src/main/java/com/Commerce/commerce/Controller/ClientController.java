package com.Commerce.commerce.Controller;

import com.Commerce.commerce.Entity.Client;
import com.Commerce.commerce.Service.ClientService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/clients")

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
@PostMapping
public Client createClient(@RequestBody Client client) {
    return clientService.saveClient(client);
}
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
