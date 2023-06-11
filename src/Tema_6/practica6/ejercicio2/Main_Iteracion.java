package Tema_6.practica6.ejercicio2;

public class Main_Iteracion {
    private static String n;

    public static void main(String[] args) {
        int n = 3;
        printMoves(n);

    }


    public static void printMoves(int n) {
        int sourcePeg = 0;
        int destinationPeg = 2;
        int auxiliaryPeg = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                printMove(sourcePeg, auxiliaryPeg, destinationPeg);
            }
            if (n % 2 == 0) {
                printMove(sourcePeg, destinationPeg, auxiliaryPeg);
            }
            n = n / 2;
            int temp = sourcePeg;
            sourcePeg = destinationPeg;
            destinationPeg = auxiliaryPeg;
            auxiliaryPeg = temp;
        }
    }

    public static void printMove(int sourcePeg, int auxiliaryPeg, int destinationPeg) {
        System.out.println("Mover disco " + n + " desde " + sourcePeg + " a " + destinationPeg);
    }
}
