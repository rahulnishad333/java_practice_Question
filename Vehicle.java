//Parent Class 
class Vehicle {
    String brand;
    String model;
    int year;

    public void drive() {
        System.out.println("Driving the vehicle.");
    }
}
//Child Class that Inherit from Parent class
//Second Class Car where Vehicle class is extends
class Car extends Vehicle {
    String color;
   
    public void honk() {
        System.out.println("This is the Honking car.");
    }
}
//The main class where Car class is called 
class Main {
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Set car details
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        myCar.color = "Red";

        // Call methods on the car
        myCar.drive();
        myCar.honk();

        // Display car details
        System.out.println("Car Details:");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
    }
}
