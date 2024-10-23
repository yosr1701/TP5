package pepiniere;

public class fleur extends plante {
    private String couleur;
    private int moisF;

    public fleur(String nom, int hauteur, int age, float prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }
    public String toString() {
        return super.toString() + ", Couleur: " + couleur;
    }

    public void description() {
        System.out.println(this.toString());
        fleurir();
    }

    public String getCouleur() {
        return couleur; 
    }

    public void setCouleur(String couleur) { 
        this.couleur = couleur; 
    }

    public void fleurir() {
        if (moisF == 4 || moisF == 5 || moisF == 6) {
            System.out.println("La fleur est en fleurs.");
        } else {
            System.out.println("La fleur n'est pas en fleurs.");
        }
    }
}
