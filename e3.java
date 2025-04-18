import java.util.Scanner;

public class e3 {

    public static boolean EstInf(String vb) {
        return vb.endsWith("er")
            || vb.endsWith("ir")
            || vb.endsWith("re")
            || vb.endsWith("oir");
    }

    // Détermine le groupe du verbe
    public static int Groupe(String vb) {
        // Aller est un cas particulier du 3e groupe
        if (vb.equals("aller")) {
            return 3;
        }

        // 1er groupe : verbes en -er sauf "aller"
        if (vb.endsWith("er")) {
            return 1;
        }

        // 2e groupe : verbes réguliers en -ir qui ont le participe présent en -issant
        String[] deuxiemeGroupe = {
            "finir", "choisir", "grandir", "rougir", "applaudir", "réussir", "obéir", "punir"
        };
        for (String v : deuxiemeGroupe) {
            if (vb.equals(v)) {
                return 2;
            }
        }

        // Tous les autres sont du 3eme groupe
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vb;

        do {
            System.out.print("Saisissez un verbe à l'infinitif : ");
            vb = sc.next().toLowerCase();
            if (!EstInf(vb)) {
                System.out.println("Erreur : ce n’est pas un infinitif. Réessayez.");
            }
        } while (!EstInf(vb));

        int g = Groupe(vb);
        switch (g) {
            case 1:
                System.out.println("Le verbe \"" + vb + "\" est du 1er groupe.");
                break;
            case 2:
                System.out.println("Le verbe \"" + vb + "\" est du 2e groupe.");
                break;
            default:
                System.out.println("Le verbe \"" + vb + "\" est du 3e groupe.");
        }

        sc.close();
    }
}