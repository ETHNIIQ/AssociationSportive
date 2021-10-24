package core.assoSportive.api.DAO;

import core.assoSportive.api.model.Sportif;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

//Pas obligatoire annotation
//@Repository
public interface SportifRepository extends MongoRepository<Sportif,String> {

//    This custom method renvoi des erreures
//    Optional<Sportif> findSportifsByName(String name);

}
