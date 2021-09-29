package core.assoSportive.api.service;

import core.assoSportive.api.model.Gymnase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AssoSportiveService {

    Gymnase create(Gymnase school);

    List<Gymnase> read();

    Gymnase update(Gymnase gymnase);

    Map<String, String> delete(String id);
}