package app;

//DEVOIR 2015/2016
//EXO1
public class testPersonne {
    public static void main(final String[] args) throws Exception {

        personne med = new personne("med", "mahmoud", 24, "masculin");
        med.tostring();

        // EXO2
        // Q3-1
        cours BD = new cours(26, "Base de Données", 39);
        cours Math = new cours("Mathématique", 26, 26);
        proffesseur profMath = new proffesseur(88450, 26, Math);
        System.out.println("J'ai crée la cour de " + BD.getNom() + " dont le nombre d'heures de cours " + BD.getHcour()
                + " TP= " + BD.getHtp());
        System.out.println("j'ai cree un objet de class proffesseur dont le matricule " + profMath.getMatricule()
                + " qui ensiegne le cour de " + profMath.getCours().nom + " et le Nbre d'heures total de cours "
                + profMath.getVH());

        // Q7
        ville keydi = new ville("keédi", 55375);
        // Q8
        capital Nktt = new capital("Nouakchott", 800000, 1000);
        // Q9
        pays Mauri = new pays("Mauritanie", 3281334, Nktt);
        System.out.println("------------------");
        // pour la TEST
        System.out.println("pays: " + Mauri.Nom);
        System.out.println("Nombres des habitants:" + Mauri.Nbrehab);
        // Erreur System.out.println("Capital: "+Mauri.Capitl);
        System.out.println("Capital: " + Mauri.getCapital().getNom());

    }

}
