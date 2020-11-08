package progcomposant.tp.tp1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.dto.AdresseDTO;
import progcomposant.tp.tp1.service.AdresseService;

import java.util.Set;

@RestController
public class AdresseManager {
    @Autowired
    AdresseService adresseService;

    @GetMapping("/adresse")
    public Set<AdresseDTO> getAdresses(){
        return adresseService.findAll();
    }
    @GetMapping("/adresse/{id}")
    public Set<AdresseDTO> getAdresseByConcessionnaireId(@PathVariable int id){
        return  adresseService.findByConcessionnaireId(id);
    }

}
