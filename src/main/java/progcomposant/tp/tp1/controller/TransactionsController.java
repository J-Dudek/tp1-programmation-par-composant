package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.service.ClientService;
import progcomposant.tp.tp1.service.ConcessionnaireService;

@Api(tags = { SwaggerConfig.TRANSACTION })
@RestController
public class TransactionsController {

    @Autowired
    ClientService clientService;
    @Autowired
    ConcessionnaireService concessionnaireService;

    @ApiOperation(value = "Un client achète une voiture, il faut lier son ce Client à la Voiture en question.")
    @PostMapping(path = "/achat/{idClient}/{idVoiture}")
    public void attribuerVoiture(@PathVariable int idClient, int idVoiture){
        clientService.attribuerVoiture(idClient,idVoiture);
    }
    @ApiOperation(value = "Un concessionnaire vend une marque supplémentaire? lions les :) .")
    @PatchMapping(path= "/concessionnaire/{idConcessionnaire}/{idMarque}")
    public void ajoutMarqueAConcessionnaire(@PathVariable int idConcessionnaire,int idMarque){
        concessionnaireService.ajoutMarqueAConcessionnaire(idConcessionnaire,idMarque);
    }

}
