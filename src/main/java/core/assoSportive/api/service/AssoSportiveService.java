package core.assoSportive.api.service;

import core.assoSportive.api.model.Gymnase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssoSportiveService {

    Gymnase create(Gymnase school);

    List<Gymnase> read();
}