package core.assoSportive.api.service;

import core.assoSportive.api.DAO.AssoSportiveRepository;
import core.assoSportive.api.model.Gymnase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AssoSportiveServiceimpl implements  AssoSportiveService {

    @Autowired
    AssoSportiveRepository AssoSportiveRepository;

    @Override
    public Gymnase create(Gymnase gymnase) {
        return AssoSportiveRepository.insert(gymnase);
    }

    @Override
    public List<Gymnase> read() {
        return AssoSportiveRepository.findAll();
    }

    @Override
    public Gymnase update(Gymnase gymnase) {
        return AssoSportiveRepository.save(gymnase);
    }

    @Override
    public Map<String, String> delete(String id) {

//        Check si ça a bien été deleted => Je compte avant et je compte après
        long beforeDelete = AssoSportiveRepository.count();
        AssoSportiveRepository.deleteById(id);
        long afterDelete = AssoSportiveRepository.count();

//        1 way de faire de la gestion d'erreur au niveau du delete
        String messageValue = beforeDelete ==afterDelete ? "Something went wrong" : "Effacé";
//        Ci-dessus mets une condition if var 1 = var 2  fait ce qu'il y a après "?" sinon fait ce qu'il y a après ":"

//        J'associe le retour du if à message
        Map<String, String> deleteMap =new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }

}
