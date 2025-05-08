import java.util.Scanner;

public class App4 {
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

    public static void RemplirTAb(double[][] matrice, int n1, int n2) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextDouble();
            }
        }
    }
    
    public static double CalculSomme(double[][] matrice, int n2, int i) {
        double somme = 0.0;
        for (int j = 0; j < n2; j++) {
            somme += matrice[i][j];
        }
        return somme;
    }
    
    public static void AfficheTAb(double[][] matrice, int n1, int n2) {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Saisie de la matrice M:");
        
        System.out.println("Nombre de lignes (n1):");
        int n1 = lectureN();
        
        System.out.println("Nombre de colonnes (n2):");
        int n2 = lectureN();
        
        double[][] M = new double[n1][n2];
        RemplirTAb(M, n1, n2);
        
        System.out.println("\nMatrice M:");
        AfficheTAb(M, n1, n2);
        
        System.out.println("\nSommes par ligne:");
        for (int i = 0; i < n1; i++) {
            double somme = CalculSomme(M, n2, i);
            System.out.println("Ligne " + i + " : " + somme);
        }
    }
}