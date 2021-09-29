package core.assoSportive.api.controller;

import core.assoSportive.api.model.Gymnase;
import core.assoSportive.api.service.AssoSportiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gymnase")
public class GymnaseController {

    @Autowired
    AssoSportiveService AssoSportiveService;

    @GetMapping("/allGymnase")
    public List<Gymnase> listAll(){

        return AssoSportiveService.read();

    }
    @GetMapping("/something")
    public String FirsTry(){

        return " I return a message ";

    }

    @PostMapping (consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Gymnase saveGymnase(@RequestBody Gymnase gymnase){

        return AssoSportiveService.create(gymnase);
    }



}
