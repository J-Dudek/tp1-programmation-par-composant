package progcomposant.tp.tp1.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
    @ManyToMany(mappedBy = "voitures")
    private Set<Client> clients;

}
