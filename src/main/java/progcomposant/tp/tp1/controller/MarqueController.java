package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.dto.MarqueDTO;
import progcomposant.tp.tp1.service.MarqueService;

import java.util.Set;


@Api(tags = { SwaggerConfig.MARQUE })
@RestController()
public class MarqueController {

    @Autowired
    MarqueService marqueService;

    @ApiOperation(value = "Récupère toutes les marques en BDD.")
    @GetMapping(path = "/marque")
    public Set<MarqueDTO> findAll(){
        return marqueService.findAll();
    }

    @ApiOperation(value = "récupère une marque en fonction du nom fournie, permet de voir si elle est en base par exemple.")
    @GetMapping(path = "/marque/{nom}")
    public MarqueDTO findByNom(@PathVariable String nom){
        return marqueService.findByNom(nom);
    }

    @ApiOperation(value = "Crée une marque en BDD.")
    @PostMapping(path = "/marque")
    public void createMarque(@RequestBody MarqueDTO marqueDTO){
        marqueService.createMarque(marqueDTO);
    }

    @ApiOperation(value = "Supprime une marque en BDD, int id passé en paramètre.")
    @DeleteMapping(path = "/marque/{id}")
    public void deleteById(@PathVariable int id){
        marqueService.deleteById(id);
    }
}
