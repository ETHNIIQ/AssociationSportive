package core.assoSportive.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor

//@Document annotation identifies a domain object to be persisted to MongoDB.
@Document
public class Seance {

   private int IdSportifEntraineur;
   private String Jour;
   private int Horaire;
   private int Duree;
   private String Libelle;
}
