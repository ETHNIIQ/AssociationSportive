package core.assoSportive.api.DAO;

import core.assoSportive.api.model.Gymnase;
import core.assoSportive.api.model.Sportif;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Pas obligatoire annotation
//@Repository
public interface GymnaseRepository extends MongoRepository<Gymnase,String> {
//extends mongo repositories enn plus des méthode here elle prend toutes les methode def dans mongo repositori et dans interface antérieur
    Optional<Gymnase> findGymnasesByVille(String ville);
    Optional<Gymnase> findGymnasesBySurface(int surface);

}
