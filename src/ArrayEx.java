import java.util.Arrays;
import java.util.Random;

public class ArrayEx {

    public static void main(String[] args) {

        // 10 as First or Last in Array
        Random random = new Random();

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            int randomNum = random.nextInt(40) + 1;
            array[i] = randomNum;
        }

        if ( array[0] == 10 && array[9] == 10)
            System.out.println("10 è il primo e l'ultimo numero");

        System.out.println("Array: " + Arrays.toString(array));
        if(array[0] == 10)
        {
            System.out.println("10 è il primo numero");
            if (array[9] == 10)
            {
                System.out.println("10 è il ultimo numero");
            }
        }
        else if (array[9] == 10)
            System.out.println("10 è l' ultimo numero");
        else
            System.out.println("10 non è il primo ne' l'ultimo numero dell'array");


        //New Array with Ends of Two Arrays
        System.out.println("\nNuovo Eserciccio —————————————————————————————————————————:\n");

        int[] arr1 = new int[]{1,3,5};
        int[] arr2 = new int[]{6,8,10};
        int[] arr3 = new int[]{arr1[0], arr2[arr2.length - 1]};
//      int[] arr3 = new int[2];
//      arr3[0] = arr1[0];
//      arr3[1] = arr2[arr2.length - 1];

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array Combinato: " + Arrays.toString(arr3));

        //LE MATRIX oui oui


    }

}
