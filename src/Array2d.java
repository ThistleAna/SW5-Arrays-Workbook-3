public class Array2d {
    public static void main(String[] args) {
        // 2 Dimension Array = array with multiple columns and rows
        String [][] students = {
                {"Harry", "Potter", "M"},
                {"Ron", "Weasley", "M"},
                {"Hermione", "Granger", "F"}
        };

        // PRINT ALL ELEMENTS
        for (int i=0; i < students.length; i++) { // row counter
            for (int j=0; j < students[i].length; j++) { // column counter
                System.out.print(students[i][j] + " ");
            }
            System.out.println();
        }
    }
}
