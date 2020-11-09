package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.dto.ClientDTO;
import progcomposant.tp.tp1.service.ClientService;

import java.util.Set;

@Api(tags = { SwaggerConfig.CLIENT })
@RestController()
public class ClientController {
    @Autowired
    ClientService clientService;

    @ApiOperation(value = "Récupère les clients en BDD")
    @GetMapping(path="/client")
    public Set<ClientDTO> getAllClient(){
        return clientService.findAll();
    }

    @ApiOperation(value = "Crée ou met à jour un client en BDD.")
    @PatchMapping("/client")
    public void saveOrUpdate(@RequestBody ClientDTO clientDTO) {
        clientService.saveOrUpdate(clientDTO);
    }
    @ApiOperation(value = "Supprime un client, id passé en param..")
    @DeleteMapping(path = "/client/{id}")
    public void deleteById(@PathVariable int id){
        clientService.deleteById(id);
    }
}
