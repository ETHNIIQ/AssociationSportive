package core.assoSportive.api.DAO;

import core.assoSportive.api.model.Gymnase;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

//@Repository
public interface GymnaseRepository extends MongoRepository<Gymnase,String> {
    Optional<Gymnase> findGymnasesByVille(String ville);
    Optional<Gymnase> findGymnasesBySurface(int surface);

}
