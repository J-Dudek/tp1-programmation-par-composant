package progcomposant.tp.tp1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
    @Id
    private int id;
    private String numero;
    private String rue;
    private String complement;
    private int codepostal;
    private String ville;

    @ManyToOne
    @JoinColumn(name="id_concessionnaire")
    private Concessionnaire concessionnaire;

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getComplement() {
        return complement;
    }

    public int getCodepostal() {
        return codepostal;
    }

    public String getVille() {
        return ville;
    }

}
