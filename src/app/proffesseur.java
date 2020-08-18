package app;

//Q2-1
public class proffesseur {
    static private int matricule;
    private String nom;
    private String prenom;
    private int VH;
    private cours courD;

    proffesseur(int matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    proffesseur(int matricule, int VH, cours courD) {
        this.matricule = matricule;
        this.VH = VH;
        this.courD = courD;
    }

    // Q2-2
    // SET
    void setNom(String nom) {
        this.nom = nom;
    }

    void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    void setMatricul(int matricule) {
        this.matricule = matricule;
    }

    void setVH(int VH) {
        this.VH = VH;
    }

    void setCour(cours courD) {
        this.courD = courD;
    }

    // GET
    String getNom() {
        return nom;
    }

    String getPrenom() {
        return prenom;
    }

    int getMatricule() {
        return matricule;
    }

    cours getCours() {
        return courD;
    }

    int getVH() {
        return VH;
    }

}