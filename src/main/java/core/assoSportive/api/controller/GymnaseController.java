package core.assoSportive.api.controller;

import core.assoSportive.api.model.Gymnase;
import core.assoSportive.api.service.AssoSportiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PostMapping ("/add")
    public Gymnase saveGymnase(@RequestBody Gymnase gymnase){

        return AssoSportiveService.create(gymnase);
    }


//  question still :
//  - how you know the id on the webpage it's invisible
    @DeleteMapping("/{id}")
    public Map<String, String> deleteSchool(@PathVariable String id){

        return AssoSportiveService.delete(id);
    }

    @PutMapping("/modifier")
    public Gymnase UpdatedGymnase(@RequestBody Gymnase gymnase){

        return AssoSportiveService.update(gymnase);
    }



}
