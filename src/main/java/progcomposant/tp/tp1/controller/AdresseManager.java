package progcomposant.tp.tp1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/adresse")
    public void createAdresse(@RequestBody AdresseDTO adresseDTO) {
        adresseService.createAdresse(adresseDTO);
    }

}
