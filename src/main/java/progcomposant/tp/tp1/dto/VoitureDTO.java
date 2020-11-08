package progcomposant.tp.tp1.dto;


public class VoitureDTO {

    private int id;
    private String modele;
    private String couleur;
    private String option;
    private MarqueDTO marqueDTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public MarqueDTO getMarqueDTO() {
        return marqueDTO;
    }

    public void setMarqueDTO(MarqueDTO marqueDTO) {
        this.marqueDTO = marqueDTO;
    }
    @Override
    public String toString() {
        return "VoitureDTO{" +
                "id=" + id +
                ", modele='" + modele + '\'' +
                ", couleur='" + couleur + '\'' +
                ", option='" + option + '\'' +
                ", marqueDTO=" + marqueDTO +
                '}';
    }
}
