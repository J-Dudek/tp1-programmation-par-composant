package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
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


}
