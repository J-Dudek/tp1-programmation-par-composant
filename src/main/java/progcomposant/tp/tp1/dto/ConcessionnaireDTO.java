package progcomposant.tp.tp1.dto;

import java.util.Set;

public class ConcessionnaireDTO {
    private int id;
    private String nom;
    private Set<AdresseDTO> adressesDTO;
    private Set<MarqueDTO> marquesDTO;

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

    public Set<AdresseDTO> getAdressesDTO() {
        return adressesDTO;
    }

    public void setAdressesDTO(Set<AdresseDTO> adressesDTO) {
        this.adressesDTO = adressesDTO;
    }

    public Set<MarqueDTO> getMarquesDTO() {
        return marquesDTO;
    }

    public void setMarquesDTO(Set<MarqueDTO> marquesDTO) {
        this.marquesDTO = marquesDTO;
    }

    @Override
    public String toString() {
        return "ConcessionnaireDTO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
