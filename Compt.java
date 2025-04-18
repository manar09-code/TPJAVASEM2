import java.util.Scanner;

public class Compt {

    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif: ");
            n = scanner.nextInt();
        } while (n <= 0); 
    }

    public static int Compter(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10; 
            count++;   
        }
        return count;
    }

    public static void main(String[] args) {
        // Lire un entier strictement positif
        int nombre = lectureN();

        // Compter le nombre de chiffres
        int nombreChiffres = Compter(nombre);

        // Afficher le résultat
        System.out.println("Le nombre de chiffres est: " + nombreChiffres);
    }
}