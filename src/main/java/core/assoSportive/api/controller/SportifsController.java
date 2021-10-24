package core.assoSportive.api.controller;

import core.assoSportive.api.model.Sportif;
import core.assoSportive.api.service.SportifServiceimpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/sportifs")
public class SportifsController {

    private final SportifServiceimpl sportifServiceimpl;

    @GetMapping("/allSportifs")
    public List<Sportif> listAllSportif(){
        return sportifServiceimpl.read();
    }

    @PostMapping("/newSportif")
    public Sportif addSportif(@RequestBody Sportif sportif){
         return sportifServiceimpl.create(sportif);
    }

    public Sportif updateSportif(@RequestBody Sportif sportif){
        return sportifServiceimpl.update(sportif);
    }

    @DeleteMapping("/{id}")
    public Map<String,String> DeleteSportif(@PathVariable String id){
        return sportifServiceimpl.delete(id);
    }



}
