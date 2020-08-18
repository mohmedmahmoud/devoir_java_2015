package app;

//Q9
public class pays {
    String Nom;
    int Nbrehab;
    capital Capitl;

    pays(String nom, int nbrehab, capital capitl) {
        Nom = nom;
        Nbrehab = nbrehab;
        Capitl = capitl;
    }

    capital getCapital() {
        return Capitl;
    }
}