package core.assoSportive.api.service;

import core.assoSportive.api.DAO.SportifRepository;
import core.assoSportive.api.model.Sportif;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Est ce que ça ajoute le constructeur des objets instancié dans la classe
//@AllArgsConstructor // equivalent à l-15-16
//@AllArgsConstructor
@Service
public class SportifServiceimpl implements AssoSportiveService<Sportif>{

    //    J'ajoute en paramètre sportifRepository dans le constructeur de ma classe Sportif Service... pour use les method implementé dans cette classe here
    public SportifServiceimpl(SportifRepository assoSportiveRepo){
        this.sportifRepository =assoSportiveRepo;
    }
    private final SportifRepository sportifRepository;


    @Override
    public Sportif create(Sportif sportif) {
        return sportifRepository.insert(sportif);
    }

    @Override
    public List<Sportif> read() {
        return sportifRepository.findAll();
    }

    @Override
    public Sportif update(Sportif sportif) {
        return sportifRepository.save(sportif);
    }

    @Override
    public Map<String, String> delete(String id) {
        long before = sportifRepository.count();
        sportifRepository.deleteById(id);
        long after = sportifRepository.count();

        String msg= before==after ?"Something wrong" : "deleted succesfuly";

        HashMap <String,String> map = new HashMap<>();
        map.put("Message : ", msg);
        return null;
    }
}
