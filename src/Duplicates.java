// import random class
import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // initialise array 1, size 10
        int [] array1 = new int [10];
        // initialise array 2, size 10
        int [] array2 = new int [10];
        // generating random number for array1
        System.out.println("Generating Array 1, random values between 1 to 20");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20) + 1;
            System.out.print(array1[i] + " | ");
        }
        // generating random number for array2

        System.out.println("\nGenerating Array 2, random values between 1 to 20");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = random.nextInt(20) + 1;
            System.out.print(array2[i] + " | ");
        }
        // advance : find duplicates using nested for loop
        System.out.println("\nPrinting duplicates");
        for (int i=0; i < array1.length; i++) { // this for loop to access array1 index
           for (int j=0; j < array2.length; j++) { // this for loop to access array2 index
               if (array1[i] == array2[j]) {
                    // print the duplicated value
                   System.out.println(array1[i]);
               }
           }
        }
    }
}
