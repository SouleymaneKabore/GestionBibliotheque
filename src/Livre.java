public class Livre {
    private String titre;
    private String auteur;
    private String annee;
    private boolean disponible;

    public Livre(String titre, String auteur, String annee, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getAnnee() {
        return annee;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
