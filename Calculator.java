import java.util.Scanner;

public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        
        System.out.println("Enter two integers to add:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int result1 = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + result1);

        
        System.out.println("\nEnter three integers to add:");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        int result2 = calc.add(int3, int4, int5);
        System.out.println("Sum of three integers: " + result2);

        
        System.out.println("\nEnter two decimal numbers to add:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        double result3 = calc.add(double1, double2);
        System.out.println("Sum of two doubles: " + result3);

        scanner.close();
    }
}
