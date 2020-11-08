package progcomposant.tp.tp1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import progcomposant.tp.tp1.configuration.SwaggerConfig;
import progcomposant.tp.tp1.service.EtatService;

@Api(tags = { SwaggerConfig.INFOSBDD })
@RestController()
public class InfosBDD {
    @Autowired
    EtatService etatService;

    @ApiOperation(value = "Permet de récupèrer les count de chanque entité.")
    @GetMapping(path="/")
    public StringBuilder getAllInfosBDD(){
        return etatService.getAllInfosBDD();
    }
}
