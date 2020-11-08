package progcomposant.tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"clients"})
@NoArgsConstructor
public class Voiture {
    @Id
    private int id;
    private String modele;
    private String couleur;
    private String option;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name="marque_id")
    private Marque marque;
    @ManyToMany(mappedBy = "voitures",cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Client> clients;

}
