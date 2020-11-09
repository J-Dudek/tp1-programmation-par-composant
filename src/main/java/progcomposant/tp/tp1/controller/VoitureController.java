package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.dto.VoitureDTO;
import progcomposant.tp.tp1.service.VoitureService;

import java.util.Set;


@Api(tags = { SwaggerConfig.VOITURE })
@RestController()
public class VoitureController {
    @Autowired
    VoitureService voitureService;

    @ApiOperation(value = "Récupère toutes les voi eturesn BDD.")
    @GetMapping(path = "/voiture")
    public Set<VoitureDTO> findAll(){
        return voitureService.findAll();
    }

    @ApiOperation(value = "Récupère toutes les voitures en BDD en fonction de l'id de marque en param.")
    @GetMapping("/voiture/{id}")
    public Set<VoitureDTO> findVoitureByMarqueId(@PathVariable int id){
        return  voitureService.findByMarqueId(id);
    }

    @ApiOperation(value = "Ajoute une voiture en base.")
    @PostMapping(path = "/voiture")
    public void createVoiture(@RequestBody VoitureDTO voitureDTO){
        voitureService.createVoiture(voitureDTO);
    }

    @ApiOperation(value = "Supprime une voiture de la base, id passé en param.")
    @DeleteMapping(path = "/voiture/{id}")
    public void deleteById(@PathVariable int id){
        voitureService.deleteById(id);
    }

}
