package progcomposant.tp.tp1.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

    @ManyToOne
    @JoinColumn(name="marque_id")
    private Marque marque;

    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;

}
