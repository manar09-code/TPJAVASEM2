import java.util.Scanner;

public class e2 {
    // Reads two numbers and returns them in an array
    public static int[] lecture2nb(Scanner scanner) {
        System.out.println("Donner deux nombres:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        return new int[]{n1, n2};
    }

    public static int addition(int n1, int n2) {
        return n1 + n2;
    }

    public static int soustraction(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static int division(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Erreur: Division par zéro!");
            return 0;
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int n1, n2;

        do {
            numbers = lecture2nb(scanner);
            n1 = numbers[0];
            n2 = numbers[1];

            // Skip calculations kan wahed fihom 0
            if (n1 == 0 || n2 == 0) {
                break;
            }

            //addition
            System.out.println("Addition: " + addition(n1, n2));
            //soustraction
            System.out.println("Soustraction: " + soustraction(n1, n2));
            //multiplication
            System.out.println("Multiplication: " + multiplication(n1, n2)); 
            //division
            System.out.println("Division: " + division(n1, n2));

        } while (n1 != 0 && n2 != 0);  // Continue ONLY if both mech 0

    
        scanner.close();
    }
}