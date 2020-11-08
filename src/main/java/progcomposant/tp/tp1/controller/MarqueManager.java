package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.dto.MarqueDTO;
import progcomposant.tp.tp1.service.MarqueService;

import java.util.Set;


@RestController()
public class MarqueManager {

    @Autowired
    MarqueService marqueService;

    @GetMapping(path = "/marque")
    public Set<MarqueDTO> findAll(){
        return marqueService.findAll();
    }
    @GetMapping(path = "/marque/{nom}")
    public MarqueDTO findByNom(@PathVariable String nom){
        return marqueService.findByNom(nom);
    }
}
