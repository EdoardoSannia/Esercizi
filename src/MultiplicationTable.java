import java.util.Scanner;

public class MultiplicationTable {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        //Esercizio fattoriale

        System.out.println("Fattoriale di " + num + ":");
        int factorial = 1;
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        System.out.println("Il fattoriale di " + num + " è: " + factorial);

        //Esercizio per calcolare il numero di cifre di un numero
        System.out.println("Inserisci un altro numero: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        int numberOfDigits = 0;
        int num3 = num2;
        while (num3 > 0) {
            numberOfDigits++;
            num3 /= 10;
        }

        System.out.println("Il numero di cifre di " + num2 + " è: " + numberOfDigits + "\n");

        //Expression Evaluation
        System.out.println("Equazione: " + "((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))" +
                " = " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

    }
}
