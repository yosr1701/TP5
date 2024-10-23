package pepiniere;

public class plante {
	protected String nom;
    protected int hauteur; 
    protected int age; 
    protected float prix; 
    
    public plante(String nom, int hauteur, int age, float prix) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.age = age;
        this.prix = prix;
    }
    public String getNom() {
        return nom;
    }

    public void SetNom(String nom) {
        this.nom = nom;
    }
   
    public String toString() {
        return "Nom: " + nom + ", Hauteur: " + hauteur + " cm, Age: " + age + " mois, Prix: " + prix ;
    }
    public void description() {
        System.out.println(this.toString());
    }
 
}
