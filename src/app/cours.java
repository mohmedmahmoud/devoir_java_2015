package app;

//Q1-1
public class cours {
    String nom;
    int hCour;
    int hTD;
    int hTP;

    cours(String nom, int hCour, int hTD) {
        this.nom = nom;
        this.hCour = hCour;
        this.hTD = hTD;

    }

    cours(String nom, int hCour, int hTD, int hTP) {
        this.nom = nom;
        this.hCour = hCour;
        this.hTD = hTD;
        this.hTP = hTP;
    }

    cours(int hTP, String nom, int hCour) {
        this.nom = nom;
        this.hCour = hCour;
        this.hTP = hTP;

    }

    // Q1-2
    // GET accesseurs
    String getNom() {
        return nom;
    }

    int getHcour() {
        return hCour;
    }

    int getHtd() {
        return hTD;
    }

    int getHtp() {
        return hTP;
    }

    // SET mutateurs
    void getNom(String nom) {
        this.nom = nom;
    }

    void getHcour(int hCour) {
        this.hCour = hCour;
    }

    void getHtd(int hTD) {
        this.hTD = hTD;
    }

    void getHtp(int hTP) {
        this.hTP = hTP;
    }

}