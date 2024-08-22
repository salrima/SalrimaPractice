public class Calculator{
    private double result;
    public double add(double a, double b) {
        result = a + b;
        return result;
    }
   
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding numbers
        System.out.println("Addition Result: " + calc.add(5, 3));
    
    }
    
   
}