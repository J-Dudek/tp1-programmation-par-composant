package progcomposant.tp.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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

}
