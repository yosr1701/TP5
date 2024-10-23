package pepiniere;

class pepiniere {
    private static final int MAX_PLANTES = 1000;
    private plante[] inventaire;
    private int nombreDePlantes;

    public pepiniere() {
        inventaire = new plante[MAX_PLANTES];
        nombreDePlantes = 0;
    }

    public void ajoutPlante(plante plante) {
        if (nombreDePlantes < MAX_PLANTES) {
            inventaire[nombreDePlantes++] = plante;
        } else {
            System.out.println("Desole L'inventaire est plein.");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nombreDePlantes; i++) {
            inventaire[i].description();
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof arbre) {
                total += ((arbre) inventaire[i]).absorptionCO2();
            }
        }
        return total;
    }

    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof arbre) {
                arbre arbre = (arbre) inventaire[i];
                if (arbre.getTypeFeuillage().equals("caduque")) {
                    count++;
                }
            }
        }
        return count;
    }

}
