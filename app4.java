import java.util.Scanner;

public class app4 {
    public static String Lecture() {
        Scanner sc = new Scanner(System.in);
        String ch;
        do {
            System.out.print("Saisir une chaîne (max 30 caractères) : ");
            ch = sc.next();
        } while (ch.length() > 30);
        return ch;
    }

    public static void Palindrom_rec(String ch) {
        if (ch.charAt(0) == ch.charAt(ch.length() - 1)) {
            System.out.println("Le mot est un palindrome.");

        } else {
            System.out.println("Le mot n'est pas un palindrome.");
        }
    }

    public static void main(String[] args) {
        String mot = Lecture();
        Palindrom_rec(mot);
    }
}