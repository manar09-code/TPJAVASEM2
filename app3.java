import java.util.Scanner;

public class app3 {
    public static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Saisir un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void EstPremier_rec(int n, int i) {
        if (n == 1) {
            System.out.println("1 n'est pas un nombre premier.");
        } else if (i == 1) {  
            System.out.println(n + " est un nombre premier.");
        } else if (n % i == 0) {  
            System.out.println(n + " n'est pas un nombre premier.");
        } else {  
            EstPremier_rec(n, i - 1);
        }
    }

    public static void main(String[] args) {
        int n = Lecture();
        EstPremier_rec(n, n - 1);  
    }
}