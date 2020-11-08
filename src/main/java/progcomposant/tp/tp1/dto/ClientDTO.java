package progcomposant.tp.tp1.dto;

import java.util.Set;

public class ClientDTO {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private Set<VoitureDTO> voituresDTO;


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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Set<VoitureDTO> getVoituresDTO() {
        return voituresDTO;
    }

    public void setVoituresDTO(Set<VoitureDTO> voituresDTO) {
        this.voituresDTO = voituresDTO;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", voituresDTO=" + voituresDTO +
                '}';
    }
}
