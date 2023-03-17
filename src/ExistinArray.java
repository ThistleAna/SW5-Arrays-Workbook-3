// import java util scanner
import java.util.Scanner;
public class ExistinArray {
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // create int array numbers[] with 10 numbers inside
        int [] numbers = {5, 15, 55, 35, 20};
        // ask user to guess the number
        System.out.println("Guess my number, my number is divisible by 5 and between 1 -60 ");
        System.out.println("Enter your guess: ");
        // save user input, int guess = reader.nextInt()
        int guess = reader.nextInt();
        // use for loop to access your array, if numbers[i] == guess, you found the number
        Boolean valueFind = false;
        for (int i=0; i < numbers.length; i++){
            if (guess == numbers[i]){
                valueFind = true;
            }
        }

        // print if guess not available, say your guess is incorrect, otherwise say you guessed my numbers.
        
        if (valueFind){
            System.out.println("You guessed  my number!");
        } else {
            System.out.println("Sorry, I do not have that number");
        }
    }
}
