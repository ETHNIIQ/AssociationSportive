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

        long beforeDelete = GymnaseRepository.count();
        GymnaseRepository.deleteById(id);
        long afterDelete = GymnaseRepository.count();

        String messageValue = beforeDelete ==afterDelete ? "Something went wrong" : "Effacé";

        Map<String, String> deleteMap =new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }

}
