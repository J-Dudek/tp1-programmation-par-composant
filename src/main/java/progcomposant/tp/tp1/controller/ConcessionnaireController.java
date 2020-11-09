package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.dto.ConcessionnaireDTO;
import progcomposant.tp.tp1.service.ConcessionnaireService;

import java.util.Set;

@Api(tags = { SwaggerConfig.CONCESSIONNAIRE })
@RestController()
public class ConcessionnaireController {
    @Autowired
    ConcessionnaireService concessionnaireService;

    @ApiOperation(value = "Récupère tout les concessionnaires en BDD.")
    @GetMapping(path="/concessionnaire")
    public Set<ConcessionnaireDTO> getAllConcessionnaire(){
        return concessionnaireService.findAll();
    }

    @ApiOperation(value = "Crée ou met à jour un concessionnaire en BDD.")
    @PatchMapping("/concessionnaire")
    public void saveOrUpdate(@RequestBody ConcessionnaireDTO concessionnaireDTO) {
        concessionnaireService.saveOrUpdate(concessionnaireDTO);
    }
    @ApiOperation(value = "Récupère tout les concessionnaires qui vendent une marque donnée en param (String marque).")
    @GetMapping(path = "concessionnaire/{marque}")
    public Set<ConcessionnaireDTO> getConcessionnaireByMarque(@PathVariable String marque){
        return concessionnaireService.findConcessionnaireByMarques(marque);
    }

    @ApiOperation(value = "Supprime un concessionnaire en BDD.")
    @DeleteMapping(path = "/concessionnaire/{id}")
    public void deleteById(@PathVariable int id){
        concessionnaireService.deleteById(id);
    }

}
