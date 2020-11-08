package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.dto.ConcessionnaireDTO;
import progcomposant.tp.tp1.service.ConcessionnaireService;

import java.util.Set;

@RestController()
public class ConcessionnaireManager {
    @Autowired
    ConcessionnaireService concessionnaireService;

    @GetMapping(path="/concessionnaire")
    public Set<ConcessionnaireDTO> getAllConcessionnaire(){
        return concessionnaireService.findAll();
    }

    @PostMapping("/concessionnaire")
    public void createConcessionnaire(@RequestBody ConcessionnaireDTO concessionnaireDTO) {
        concessionnaireService.createConcessionnaire(concessionnaireDTO);
    }

    @DeleteMapping(path = "/concessionnaire/{id}")
    public void deleteById(@PathVariable int id){
        concessionnaireService.deleteById(id);
    }

}
