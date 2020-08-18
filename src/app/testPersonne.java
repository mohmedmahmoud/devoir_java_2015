package app;
//DEVOIR 2015/2016
//EXO1
public class testPersonne {
    public static void main(final String[] args) throws Exception {
        System.out.println("Hello, World!");
         personne med =new personne("med", "mahmoud", 24, "masculin");
         med.tostring();
        
         //EXO2
         //Q3-1
         cours BD=new cours(26,"Base de Données",39 );
         cours Math=new cours("Mathématique",26 , 26);
         proffesseur profMath= new proffesseur(88450,26,Math);
        System.out.println("J'ai crée la cour de "+BD.getNom()+
        " dont le nombre d'heures de cours "+BD.getHcour()+" TP= "+BD.getHtp());
        System.out.println("j'ai cree un objet de class proffesseur dont le matricule "+profMath.getMatricule()+
         " qui ensiegne le cour de "+profMath.getCours().nom+
         " et le Nbre d'heures total de cours "+profMath.getVH());
    }

  
}
