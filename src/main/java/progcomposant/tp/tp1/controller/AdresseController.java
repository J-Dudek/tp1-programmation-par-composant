package progcomposant.tp.tp1.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.dto.AdresseDTO;
import progcomposant.tp.tp1.service.AdresseService;

import java.util.Set;
@Api(tags = { SwaggerConfig.ADDRESSE })
@RestController
public class AdresseController {
    @Autowired
    AdresseService adresseService;

    @ApiOperation(value = "Récupère toutes les adresses contenues en BDD")
    @GetMapping("/adresse")
    public Set<AdresseDTO> getAllAdresses(){
        return adresseService.findAll();
    }
    @ApiOperation(value = "Récupère toutes les adresses d'un concessionnaire,id(int) en param.")
    @GetMapping("/adresse/{id}")
    public Set<AdresseDTO> getAdresseByConcessionnaireId(@PathVariable int id){
        return  adresseService.findByConcessionnaireId(id);
    }
    @ApiOperation(value = "Permet l'insertion en base d'une nouvelle Adresse")
    @PostMapping("/adresse")
    public void createAdresse(@RequestBody AdresseDTO adresseDTO) {
        adresseService.createAdresse(adresseDTO);
    }

    @ApiOperation(value = "Suppression d'une adresse par son id passé en parametre.")
    @DeleteMapping(path = "/adresse/{id}")
    public void deleteAdresse(@PathVariable int id){
        adresseService.deleteAdresseById(id);
    }

    @ApiOperation(value = "Mise à jour et création d'adresse.")
    @PatchMapping("/adresse")
    public void saveOrUpdateAdresse(@RequestBody AdresseDTO adresseDTO){
        adresseService.saveOrUpdateAdresse(adresseDTO);
    }
}
