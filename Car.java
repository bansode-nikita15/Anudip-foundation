import java.util.Scanner;

public class Car {
    
    private String make;
    private String model;
    private short year;
    private int price;

    
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    
    public void displayCarInfo() {
        System.out.println("\nCar Details:");
        System.out.println("Make:  " + make);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
        System.out.println("Price: $" + price);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        short year = scanner.nextShort();

        System.out.print("Enter car price: ");
        int price = scanner.nextInt();

        
        Car userCar = new Car(make, model, year, price);

        
        userCar.displayCarInfo();

        scanner.close();
    }
}
