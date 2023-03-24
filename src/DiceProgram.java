// this program will generate random number
// import random class
import java.util.Random;

public class DiceProgram {
    public static void main(String[] args) {
        // create random object
        Random random = new Random();
        // generate a random int number, save to a variable
        int number = random.nextInt(6) + 1; // boundary 1 to 6
        // print the number
        System.out.println(number);
    }
}
