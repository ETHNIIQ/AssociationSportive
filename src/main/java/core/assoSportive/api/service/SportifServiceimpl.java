package core.assoSportive.api.service;

import core.assoSportive.api.DAO.SportifRepository;
import core.assoSportive.api.model.Sportif;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@AllArgsConstructor /** Do to the same as line 16-19 **/
@Service
public class SportifServiceimpl implements AssoSportiveService<Sportif>{
    private final SportifRepository sportifRepository;

/**  Repository initialization in Service  **/
    public SportifServiceimpl(SportifRepository assoSportiveRepo) {
        this.sportifRepository =assoSportiveRepo;
    }


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
