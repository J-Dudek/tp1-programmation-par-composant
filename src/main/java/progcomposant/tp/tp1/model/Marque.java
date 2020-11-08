package progcomposant.tp.tp1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"concessionnaires"})
public class Marque {
    @Id
    private int id;
    private String nom;

    @ManyToMany
    @JoinTable(name="concessionnaire_marques",
    joinColumns= @JoinColumn(name="concessionnaire_id"),
    inverseJoinColumns = @JoinColumn(name="marque_id"))
    @JsonIgnoreProperties
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Set<Concessionnaire> concessionnaires=new HashSet<>();


}
