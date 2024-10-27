import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nombre : ");
        int n = scanner.nextInt();

        int[] tableau = new int[n];
        for (int i = 0; i < n; i++) {
            tableau[i] = i + 1;
        }

        int somme = 0;
        for (int i = 0; i < n; i++) {
            somme = tableau[i] + somme;
        }


        System.out.println("La somme des nombres jusqu'à " + n + " est " + somme);
    }
}
