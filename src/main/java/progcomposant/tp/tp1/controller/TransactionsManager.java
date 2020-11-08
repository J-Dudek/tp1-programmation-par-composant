package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.service.ClientService;

@RestController
public class TransactionsManager {

    @Autowired
    ClientService clientService;

    @PostMapping(path = "/achat/{idClient}/{idVoiture}")
    public void attribuerVoiture(@PathVariable int idClient, int idVoiture){
        clientService.attribuerVoiture(idClient,idVoiture);
    }
}
