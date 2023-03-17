public class Example2ForEachLoop {
    public static void main(String[] args) {
        int [] numbers = {34, 45, 89, 12, 13, 90, 93, 78, 43, 56};
        // use for each to print all elements
        System.out.println("Add all these numbers together");
        for (int data:numbers){
            System.out.print(data + " ");
        }
        // calculate the sum
        System.out.println("\nCalculating sum in progress....");
        int sum =0; // will remember the sum of the two indexes
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // sum += numbers[i]
            System.out.println(sum);
        }

        System.out.println("The total sum is " + sum);
        // extension calculate average and print, double average = sum/10;
    }
}
