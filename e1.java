import java.util.Scanner;

public class e1 {
    public static int lectureN(Scanner scanner) {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif: ");
            n = scanner.nextInt();
        } while (n <= 0);  
        return n;
    }
    
    public static int Compter(int n) {
        int i = 0;
        if (n == 0) {
            System.out.println("le nombre de chiffres de 0 est 1");
            return 1;
        }
        int originalN = n;  // bech matabkalich 0-8
        while (n != 0) {
            n = n / 10;
            i++;
        }
        System.out.println("le nombre de chiffres de " + originalN + " est " + i);
        return i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        // lecture n
        int n = lectureN(scanner);  
        // compter
        int i = Compter(n);
        
        scanner.close();  
    }
}