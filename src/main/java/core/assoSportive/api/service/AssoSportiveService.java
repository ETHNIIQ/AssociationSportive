package core.assoSportive.api.service;

import core.assoSportive.api.model.Gymnase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AssoSportiveService <T> {

    T create(T entity);

    List<T> read();

    T update(T entity);

    Map<String, String> delete(String id);
}