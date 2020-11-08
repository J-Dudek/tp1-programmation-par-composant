package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.dto.VoitureDTO;
import progcomposant.tp.tp1.service.VoitureService;

import java.util.Set;

@RestController()
public class VoitureManager {
    @Autowired
    VoitureService voitureService;

    @GetMapping(path = "/voiture")
    public Set<VoitureDTO> findAll(){
        return voitureService.findAll();
    }

    @GetMapping("/voiture/{id}")
    public Set<VoitureDTO> findVoitureByMarqueId(@PathVariable int id){
        return  voitureService.findByMarqueId(id);
    }

    @PostMapping(path = "/voiture")
    public void createVoiture(@RequestBody VoitureDTO voitureDTO){
        voitureService.createVoiture(voitureDTO);
    }

    @DeleteMapping(path = "/voiture/{id}")
    public void deleteById(@PathVariable int id){
        voitureService.deleteById(id);
    }

}
