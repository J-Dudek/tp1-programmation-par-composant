package progcomposant.tp.tp1.dto;

import java.util.HashSet;
import java.util.Set;


public class MarqueDTO {

    private int id;
    private String nom;
    private Set<ConcessionnaireDTO> concessionnairesDTO = new HashSet<>();
    private Set<VoitureDTO> voituresDTO = new HashSet<>();

    public MarqueDTO(){
        super();
    }

    public MarqueDTO(int id, String nom, Set<ConcessionnaireDTO> concessionnairesDTO, Set<VoitureDTO> voituresDTO) {
        this.id = id;
        this.nom = nom;
        this.concessionnairesDTO = concessionnairesDTO;
        this.voituresDTO = voituresDTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<ConcessionnaireDTO> getConcessionnairesDTO() {
        return concessionnairesDTO;
    }

    public void setConcessionnairesDTO(Set<ConcessionnaireDTO> concessionnairesDTO) {
        this.concessionnairesDTO = concessionnairesDTO;
    }

    public Set<VoitureDTO> getVoituresDTO() {
        return voituresDTO;
    }

    public void setVoituresDTO(Set<VoitureDTO> voituresDTO) {
        this.voituresDTO = voituresDTO;
    }

    @Override
    public String toString() {
        return "MarqueDTO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
