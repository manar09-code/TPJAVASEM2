import java.util.Scanner;

public class app6 {
    public static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Saisir un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void RemplirTab(int[] tab) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.print("T[" + i + "] = ");
            tab[i] = sc.nextInt();
        }
    }

    public static int SommeTab_rec(int[] tab, int i) {
        if (i == tab.length) {
            return 0;
        }
        return tab[i] + SommeTab_rec(tab, i + 1);
    }

    public static void main(String[] args) {
        int n = Lecture();
        int[] tab = new int[n];
        RemplirTab(tab);
        int somme = SommeTab_rec(tab, 0);
        System.out.println("La somme des éléments du tableau est : " + somme);
    }
}