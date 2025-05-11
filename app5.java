import java.util.Scanner;

public class App5 {
    public static String Lecture() {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Saisir une chaîne (max 50 caractères) : ");
            ch = sc.nextLine();  
        } while (ch.length() > 50);
        return ch;
    }

    public static int Nbr_Occ_rec(String ch, char c, int i) {
        if (i >= ch.length()) {
            return 0;
        }
        int count = (ch.charAt(i) == c) ? 1 : 0;
        return count + Nbr_Occ_rec(ch, c, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mot = Lecture();
        System.out.print("Entrez le caractère à compter : ");
        char c = sc.nextLine().charAt(0);
        int occurrences = Nbr_Occ_rec(mot, c, 0);
        System.out.println("Le caractère '" + c + "' apparaît " + occurrences + " fois dans la chaîne.");
    }
}