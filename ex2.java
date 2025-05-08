public class Vecteur {
    private double[] elements;
    
    // Creation d'un vecteur 
    public Vecteur(double... valeurs) {
        this.elements = valeurs;
    }
    
    // Additionne avec un autre vecteur
    public Vecteur ajouter(Vecteur autre) {
        double[] somme = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            somme[i] = elements[i] + autre.elements[i];
        }
        return new Vecteur(somme);
    }
    
    // Calcule le produit scalaire
    public double produitScalaire(Vecteur autre) {
        double resultat = 0;
        for (int i = 0; i < elements.length; i++) {
            resultat += elements[i] * autre.elements[i];
        }
        return resultat;
    }
    
    // Affiche le vecteur
    public void afficher() {
        for (double val : elements) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  
