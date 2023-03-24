// 1. import random class
import java.util.Random;
public class MinandMax {
    public static void main(String[] args) {
        // 2. create random object
        Random random = new Random();
        // 3. initialise array with 10 size
        int[] array1 = new int[10];
        // 4. generate random numbers to fill in your array
        for (int i=0; i < array1.length; i++) {
            array1[i] = random.nextInt(100) + 1;
            System.out.print(array1[i] + " | ");
        }
        // find the biggest element and print
        int max=0;
        int min = array1[0];
        for (int i =0; i < array1.length; i++) {
            if (array1[i] > max)
            {
                // update max value
                max = array1[i];
            }

            if (array1[i] < min) {
                // update min value
                min = array1[i];
            }
        }
        // outside the loop, print max
        System.out.println("\nThe biggest number in the array is " + max);
        System.out.println("\nThe smallest number in the array is " + min);

        // find the smallest element and print



    }
}
