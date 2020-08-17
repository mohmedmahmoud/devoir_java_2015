
package app;

public class personne {
    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    personne() {
    }

    personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    personne(personne p) {
        p.nom = nom;
        p.prenom = prenom;
        p.age = age;
        p.sexe = sexe;
    }

    String getNom() {
        return nom;
    }

    String getPrenom() {
        return prenom;
    }

    int getAge() {
        return age;
    }

    String getSexe() {
        return sexe;
    }

    void setNom(String nom) {
        this.nom = nom;
    }

    void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSexe(String sexe) {
        this.sexe = sexe;
    }
     void tostring(){
         System.out.println("je m'appelle "+getNom()+" "+getPrenom()+" j'ai "+getAge()+" ans Le sexe: "+getSexe());
        System.out.println("je m'appelle "+nom+" "+prenom+" j' ai "+age+" ans Le sexe: "+sexe);
    }


}