package pepiniere;

public class main {
    public static void main(String[] args) {
        System.out.println("        Pépinière GREEN HANDS");
        
        pepiniere pepiniere = new pepiniere();
        fleur rose = new fleur("Rose", 30, 12, 15, "Rouge", 2);
        fleur tulipe = new fleur("Tulipe", 20, 8, 12, "Jaune", 4);
        arbre chene = new arbre("Chêne", 200, 60, 89, "Caduque");
        arbre sapin = new arbre("Sapin", 150, 30, 59, "Persistant");

        System.out.println("La " + rose.getNom() + " a la couleur " + rose.getCouleur());
        
        pepiniere.ajoutPlante(rose);
        pepiniere.ajoutPlante(tulipe);
        pepiniere.ajoutPlante(chene);
        pepiniere.ajoutPlante(sapin);

        pepiniere.afficherInventaire();
        System.out.println("Total Absorption CO2: " + pepiniere.totalAbsorptionTotaleCO2() + " g/jour");
        System.out.println("Nombre d'arbres Caduques dans la pépinière : " + pepiniere.compterArbresCaduques());
    }
}
