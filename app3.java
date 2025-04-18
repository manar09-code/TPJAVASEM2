import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères (max 20 caractères) : ");
        StringBuffer ch = new StringBuffer();

        if (ch.length() > 20) {
            System.out.println("Erreur : La longueur dépasse la limite.");
        } else {
            StringBuffer result = new StringBuffer();
            boolean capitalizeNext = true;

            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);
                if (capitalizeNext && Character.isLetter(c)) {
                    c = Character.toUpperCase(c);
                    capitalizeNext = false;
                } else if (c == ' ') {
                    capitalizeNext = true;
                }
                result.append(c);
            }

            System.out.println("Résultat : " + result.toString());
        }

        scanner.close();
    }
}
