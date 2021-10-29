package core.assoSportive.api.DAO;

import core.assoSportive.api.model.Sportif;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SportifRepository extends MongoRepository<Sportif,String> {


}
