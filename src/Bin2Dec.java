import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        System.out.println("Inserisci numeri binari, sino a 8: ");
        String s = scanner.nextLine();
        if (s.length() > 8 || !(s.contains("1")) || !(s.contains("0"))) {
            System.out.println("Puoi Inserire solo 8 numeri e devono essere solo 1 e 0");
        } else {
            String binaryString = s;

//          METODO CON LA CONVERSIONE DA STRING A OGNI CARATTERE IN ASCII, POI DA ASCII A VALORE NUMERICO
            int[] binaryConverted = binaryString.chars().toArray();
            int[] numericValue = new int[binaryConverted.length];

            for (int i = 0; i < binaryConverted.length; i++) {
                numericValue[i] = Character.getNumericValue(binaryConverted[i]);
            }

            int decimalValue = 0;
            for (int num : numericValue) {
                decimalValue = decimalValue * 2 + num;
            }

            System.out.println("Il valore decimaele è: " + decimalValue + "\n");

            /*
            11110000

            0 * 2 + 1 = 1
            1 * 2 + 1 = 3
            3 * 2 + 1 = 7
            7 * 2 + 1 = 15
            15 * 2 + 0 = 30
            30 * 2 + 0 = 60
            60 * 2 + 0 = 120
            120 * 2 + 0 = 240
             */

            /*
            PROVATA UNA ROBA MA NON FUNZIONA O NON SO COME FARLO FUNZIONARE PS.CHIEDERE A STEFANO
            String[] binaryStringArray = binaryString.split(",");

            for (int i = binaryStringArray.length - 1; i >= 0; i--) {
                System.out.println(binaryStringArray[i]);
            }
            */

            /*
            METODO CON LA CONVERSIONE DA STRING AD ARRAY DI CHAR, DA CHAR A STRING PER UTILIZZARE IL PARSEINT E DA STRING A INT
            char[] binaryChar = binaryString.toCharArray();
            int[] binaryConvert = new int[binaryChar.length];

            for (int i = binaryChar.length - 1; i >= 0; i--) {
                int binary = Integer.parseInt(String.valueOf(binaryChar[i]));
                binaryConvert[i] = binary;
                System.out.println(binaryConvert[i]);
            }
            */
        }
    }
}