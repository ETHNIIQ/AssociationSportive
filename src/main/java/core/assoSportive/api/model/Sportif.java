package core.assoSportive.api.model;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Data
@Document("Sportifs")
public class Sportif {
    @Field ("_id")
    private String id;
    @Field("IdSportif")
    private int idSportif;
    @Field("Nom")
    private String nom;
    @Field("Prenom")
    private String prenom;
    @Field("Sexe")
    private String sexe;
    @Field("Age")
    private String age;
//    Should not let an empty class or errors!!
//    @Field("Sports")
//    List<Sport> sports;


}
