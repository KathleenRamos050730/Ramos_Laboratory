import java.util.Scanner;
class Vehicle { //Ito yung parent clsss

    private String brand;
    private double speed;
    private String fuelType;

    public Vehicle(String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand(){
        return brand;
    }

    public String getSpeed(){
        return brand;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle { //subclass to or child class
    private int numDoors;
    
    public Car(String brand, int speed, String fuelType, int numDoors) {
        
        super (brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle { //sub class or child class
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar){
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Does it have sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the car details: ");
        System.out.println("Brand: ");
        String carBrand = scan.nextLine();
        System.out.println("Speed: ");
        int carSpeed = (int) scan.nextDouble();
        scan.nextLine();
        System.out.println("Fuel Type: ");
        String carFueltype = scan.nextLine();
        System.out.println("Number of Doors: ");
        int numDoors = scan.nextInt();
        scan.nextLine();


        System.out.println("Enter the motorcyle details: ");
        System.out.println("Brand: ");
        String motorcycleBrand = scan.nextLine();
        System.out.println("Speed: ");
        int motorcycleSpeed = (int) scan.nextDouble();
        scan.nextLine();
        System.out.println("Fuel Type: ");
        String motorcycleFuel = scan.nextLine();
        System.out.println("Does it have sidecar:  ");
        String sideCarInput = scan.nextLine().trim().toLowerCase();
        boolean hasSidecar = sideCarInput.equals("yes");
        System.out.println();

        Vehicle car = new Car (carBrand, carSpeed, carFueltype, numDoors);
        Vehicle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuel, hasSidecar); 

        System.out.println("Car Details: ");
        car.displayInfo();
        System.out.println();
        System.out.println("Motorcycle Details: ");
        motorcycle.displayInfo();
        System.out.println();

    }
}