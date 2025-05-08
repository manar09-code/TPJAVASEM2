public class Vecteur {
    private double[] elements;
    
    // Crée un vecteur avec des valeurs
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
    
    // Exemple d'utilisation
    public static void main(String[] args) {
        Vecteur v1 = new Vecteur(1, 2, 3);
        Vecteur v2 = new Vecteur(4, 5, 6);
        
        System.out.print("Vecteur 1: "); v1.afficher();
        System.out.print("Vecteur 2: "); v2.afficher();
        
        Vecteur somme = v1.ajouter(v2);
        System.out.print("Somme: "); somme.afficher();
        
        System.out.println("Produit scalaire: " + v1.produitScalaire(v2));
    }
}
