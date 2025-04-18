import java.util.Scanner;

public class ConjugaisonVerbe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lire le verbe
        System.out.print("Entrez un verbe du premier groupe (terminé par 'er') : ");
        String verbe = scanner.nextLine().trim().toLowerCase();
        
        // Vérification du premier groupe (sauf "aller")
        if (!verbe.endsWith("er") || verbe.equals("aller")) {
            System.out.println("Ce n'est pas un verbe régulier du premier groupe.");
        } else {
            // Récupérer le radical standard
            String radical = verbe.substring(0, verbe.length() - 2);
            
            // Variables pour les différents pronoms
            String radicalNous = radical;
            String radicalVous = radical;
            String radicalIls = radical;
            
            // Appliquer la transformation spéciale pour "commencer"
            if (verbe.equals("commencer")) {
                radicalNous = "commenç";
                radicalVous = "commenç"; // Transformation identique pour "vous"
                radicalIls = "commenç";   // Transformation identique pour "ils/elles"
            }
            
            // Afficher la conjugaison
            System.out.println("Conjugaison au présent de l'indicatif :");
            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radicalNous + "ons");
            System.out.println("Vous " + radicalVous + "ez");
            System.out.println("Ils/Elles " + radicalIls + "ent");
        }
        
        scanner.close();
    }
}