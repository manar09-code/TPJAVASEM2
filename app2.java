import java.util.Scanner;

public class app2 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n <= 0) {
            System.out.print("Entrez un entier strictement positif : ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n < 10) {  //check for n >= 10 
                    System.out.println("La taille doit être >= 10.");
                    n = -1;  // initialisation
                } else if (n <= 0) {
                    System.out.println("L'entier doit être strictement positif.");
                }
            } else {
                System.out.println("Ce n'est pas un entier valide !");
                sc.next(); 
            }
        }
        return n;
    }

    public static void RemplirTab(int[] tab) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            while (true) {
                System.out.print("T[" + i + "] = ");
                if (sc.hasNextInt()) {
                    int note = sc.nextInt();
                    if (note >= 0 && note <= 20) {  // validation note
                        tab[i] = note;
                        break;
                    } else {
                        System.out.println("La note doit être entre 0 et 20.");
                    }
                } else {
                    System.out.println("Veuillez entrer un nombre valide.");
                    sc.next();
                }
            }
        }
    }

    public static double Calcul_Moy(int[] notes) {
        if (notes == null || notes.length == 0) {
            return 0; 
        }
        
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }

    public static int NombreNote(int[] notes) {
        if (notes == null || notes.length == 0) {
            return 0; 
        }
        
        double moyenne = Calcul_Moy(notes);
        int count = 0;
        
        for (int note : notes) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }

    public static void AfficheTab(int[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Saisie des notes de la classe:");
        int n = lectureN();
        int[] notes = new int[n];
        
        RemplirTab(notes);
        
        System.out.println("\nNotes saisies:");
        AfficheTab(notes);
        
        double moyenne = Calcul_Moy(notes);
        System.out.printf("Moyenne de la classe: %.2f\n", moyenne);
        
        int nbSupMoy = NombreNote(notes);
        System.out.println("Nombre de notes supérieures à la moyenne: " + nbSupMoy);
    }
}