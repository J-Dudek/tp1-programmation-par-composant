package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(path = "/marque")
    public void createMarque(@RequestBody MarqueDTO marqueDTO){
        marqueService.createMarque(marqueDTO);
    }

    @DeleteMapping(path = "/marque/{id}")
    public void deleteById(@PathVariable int id){
        marqueService.deleteById(id);
    }
}
