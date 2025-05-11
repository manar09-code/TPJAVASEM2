import java.util.Scanner;

public class app2 {
     public static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("saisir un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int Factoriel_rec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factoriel_rec(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = Lecture();
        int factoriel = Factoriel_rec(n);
        System.out.println("Le factoriel de " + n + " est : " + factoriel);
    }
}


