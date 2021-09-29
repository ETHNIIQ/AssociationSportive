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
//        @Field
    private int IdGymnase;
    private int Surface;
    private String Ville;
    @Field("Adresse")
    private String adressegymnase;
    private String Nomgymnase;

    @Field("Seances")
    private List<Seance> seances;
}
