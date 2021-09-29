package core.assoSportive.api.service;

import core.assoSportive.api.DAO.AssoSportiveRepository;
import core.assoSportive.api.model.Gymnase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
