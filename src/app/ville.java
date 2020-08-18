package app;

//EXO3 
//Q1
public class ville {
    private String Nom;
    private int NbreHab;

    ville(String nom, int nbrehab) {
        Nom = nom;
        NbreHab = nbrehab;
    }

    // Q2
    // SET
    void setNom(String nom) {
        Nom = nom;
    }

    void setHabit(int nbrehab) {
        NbreHab = nbrehab;
    }

    // GET
    String getNom() {
        return Nom;
    }

    int getHabit() {
        return NbreHab;
    }

}

// Q4
