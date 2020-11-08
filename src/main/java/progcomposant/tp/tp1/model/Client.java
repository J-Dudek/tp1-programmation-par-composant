package progcomposant.tp.tp1.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"voitures"})
@NoArgsConstructor
public class Client {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String mail;

    @ManyToMany
    @JoinTable(name="client_voiture",
            joinColumns= @JoinColumn(name="voiture_id"),
            inverseJoinColumns = @JoinColumn(name="client_id"))
    private Set<Voiture> voitures=new HashSet<>();
}
