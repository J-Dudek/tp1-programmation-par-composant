package progcomposant.tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;


@Data
@EqualsAndHashCode(exclude = {"marques"})
@Entity
@NoArgsConstructor
public class Concessionnaire {
    @Id
    private int id;
    private String nom;

    @ManyToMany(mappedBy = "concessionnaires")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnoreProperties
    private Set<Marque> marques;


}
