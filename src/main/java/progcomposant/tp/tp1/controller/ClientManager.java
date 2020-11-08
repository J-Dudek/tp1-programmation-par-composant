package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.dto.ClientDTO;
import progcomposant.tp.tp1.service.ClientService;

import java.util.Set;

@RestController()
public class ClientManager {
    @Autowired
    ClientService clientService;

    @GetMapping(path="/client")
    public Set<ClientDTO> getAllClient(){
        return clientService.findAll();
    }

    @PostMapping("/client")
    public void createClient(@RequestBody ClientDTO clientDTO) {
        clientService.createClient(clientDTO);
    }
}
