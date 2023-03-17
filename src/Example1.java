public class Example1 {
    public static void main(String[] args) {
        // Array = collection of data with similar datatype
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // printing array element, index starts from 0

        for (int i=0; i < cars.length; i++ ) { // loop though the index to get all elements
            System.out.println(cars[i]);
        }

        // what is the size of the array?
        System.out.println("The size of the array is " + cars.length);

    }
}
