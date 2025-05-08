import java.util.Scanner;

public class app3 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n <= 0) {
            System.out.print("Entrez un entier strictement positif : ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("L'entier doit être strictement positif.");
                }
            } else {
                System.out.println("Ce n'est pas un entier !");
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
                    int num = sc.nextInt();
                    if (num >= 0) {  // Check for positive numbers
                        tab[i] = num;
                        break;
                    } else {
                        System.out.println("Le nombre doit être positif !");
                    }
                } else {
                    System.out.println("Ce n'est pas un entier !");
                    sc.next();
                }
            }
        }
    }
    
    public static int[] creerTableauPairs(int[] tab) {
        int comptePairs = 0;
        for (int nombre : tab) {
            if (nombre % 2 == 0) comptePairs++;
        }
        
        int[] pairs = new int[comptePairs];
        int index = 0;
        
        for (int nombre : tab) {
            if (nombre % 2 == 0) {
                pairs[index] = nombre;
                index++;
            }
        }
        return pairs;
    }

    public static int[] creerTableauImpairs(int[] tab) {
        int compteImpairs = 0;
        for (int nombre : tab) {
            if (nombre % 2 != 0) compteImpairs++;
        }
        
        int[] impairs = new int[compteImpairs];
        int index = 0;
        
        for (int nombre : tab) {
            if (nombre % 2 != 0) {
                impairs[index] = nombre;
                index++;
            }
        }
        return impairs;
    }
    
    public static void AfficheTAb(int[] tab) {
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
        System.out.println("Création du tableau T:");
        int n = lectureN();
        int[] T = new int[n];
        
        RemplirTab(T);
        
        System.out.println("\nTableau original T:");
        AfficheTAb(T);
        
        int[] T_pair = creerTableauPairs(T);
        System.out.println("\nTableau des nombres pairs:");
        AfficheTAb(T_pair);
        
        int[] T_impair = creerTableauImpairs(T);
        System.out.println("Tableau des nombres impairs:");
        AfficheTAb(T_impair);
    }
}