package core.assoSportive.api.DAO;

import core.assoSportive.api.model.Gymnase;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssoSportiveRepository extends MongoRepository<Gymnase,String> {

}
