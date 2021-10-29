package core.assoSportive.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


@Document("Gymnases")
public class Gymnase {

    @Id
    private String _id; // <-- Should not be the id
    private int IdGymnase;
    private int Surface;
    @Field("Ville")
    private String Ville;
    @Field("Adresse")
    private String adressegymnase;
    private String NomGymnase;
    @Field("Seances")
    private List<Seance> seances;
}
