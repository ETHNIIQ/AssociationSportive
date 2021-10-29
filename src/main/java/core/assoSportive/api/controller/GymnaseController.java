package core.assoSportive.api.controller;

import core.assoSportive.api.model.Gymnase;
import core.assoSportive.api.service.AssoSportiveService;
import core.assoSportive.api.service.GymnaseServiceimpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gymnase")
@AllArgsConstructor

public class GymnaseController {

   private final GymnaseServiceimpl GymnaseServiceimpl;

    @GetMapping("/allGymnase")
    public List<Gymnase> listAll(){
        return GymnaseServiceimpl.read();
    }

    @PostMapping ("/add")
    public Gymnase saveGymnase(@RequestBody Gymnase gymnase) {
        return GymnaseServiceimpl.create(gymnase);
    }


    @DeleteMapping("/{id}")
    public Map<String, String> deleteSchool(@PathVariable String id){
        return GymnaseServiceimpl.delete(id);
    }

    @PutMapping("/modifier")
    public Gymnase UpdatedGymnase(@RequestBody Gymnase gymnase){
        return GymnaseServiceimpl.update(gymnase);
    }


    @GetMapping("/something")
    public String FirsTry(){
        return " I return a message ";
    }



}
