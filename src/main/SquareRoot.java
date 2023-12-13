public class SquareRoot {
    public static void main(String[] args) {
        try {
            // Creating an object of the Program class
            Program program = new Program();

            // Calling a method with positive condition
            program.calculateSquareRoot(25);

            // Calling a method with negative condition
            program.calculateSquareRoot(-25);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

class Program {
    // Method to calculate the square root of a number
    public void calculateSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + result);
    }
}