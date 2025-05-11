import java.util.Scanner;

public class app1 {

    public static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("saisir un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int Somme_rec(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + Somme_rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Lecture();
        int somme = Somme_rec(n);
        System.out.println("La somme des entiers de 1 à " + n + " est : " + somme);
    }
}