package pepiniere;

public class arbre extends plante {
    private String type_Feuillage;
    private final double AbsorMoyenne = 22.0; 

    public arbre(String nom, int hauteur, int age, float prix, String type_Feuillage) {
        super(nom, hauteur, age, prix);
        this.type_Feuillage = type_Feuillage;
    }
    public String getTypeFeuillage() {
        return type_Feuillage;
    }
   
    public String toString() {
        return super.toString() + ", Type de feuillage: " + type_Feuillage + ", Absorption de CO2: " + AbsorMoyenne + " g/jour";
    }

   
    public void description() {
        System.out.println(this.toString());
    }
    
    public double absorptionCO2() {
    	
        if (super.hauteur > 5000)
        {
            return AbsorMoyenne + 3;
        }
        return AbsorMoyenne;
    }
    
}

