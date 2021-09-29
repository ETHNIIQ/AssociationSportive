package core.assoSportive.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor

//link avec la collection dans la base de données
@Document("Gymnases")
public class Gymnase {

    @Id
    private String _id; //Identifiant par défaut
    private int IdGymnase;
    private int Surface;
    private String ville;
    private String AdresseGymnase;
    private String NomGymnase;
    private List<Seance> seances;
}
