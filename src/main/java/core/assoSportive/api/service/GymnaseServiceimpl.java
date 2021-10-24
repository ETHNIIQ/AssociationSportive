package core.assoSportive.api.service;

import core.assoSportive.api.DAO.GymnaseRepository;
import core.assoSportive.api.model.Gymnase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class GymnaseServiceimpl implements  AssoSportiveService <Gymnase >{
//implemements pour créer automatiquement les method dont j'ai besoin

    private final GymnaseRepository GymnaseRepository;

    @Override
    public Gymnase create(Gymnase gymnase) {
        return GymnaseRepository.insert(gymnase);
    }

    @Override
    public List<Gymnase> read() {
        return GymnaseRepository.findAll();
    }

    @Override
    public Gymnase update(Gymnase gymnase) {
        return GymnaseRepository.save(gymnase);
    }

    @Override
    public Map<String, String> delete(String id) {

//        Check si ça a bien été deleted => Je compte avant et je compte après
        long beforeDelete = GymnaseRepository.count();

        GymnaseRepository.deleteById(id);

        long afterDelete = GymnaseRepository.count();

//        1 way de faire de la gestion d'erreur au niveau du delete
        String messageValue = beforeDelete ==afterDelete ? "Something went wrong" : "Effacé";
//        Ci-dessus mets une condition if var 1 = var 2  fait ce qu'il y a après "?" sinon fait ce qu'il y a après ":"

//        J'associe le retour du if à message
        Map<String, String> deleteMap =new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }

}
