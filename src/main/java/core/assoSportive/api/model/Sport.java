package core.assoSportive.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Document
public class Sport {
    @Field("Jouer")
    private List<String> jouer;
    @Field("Arbitrer")
    private List<String> arbitrer;
    @Field("Entrainer")
    private List<String> entrainer;

}
