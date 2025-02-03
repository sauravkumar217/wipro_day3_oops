/*Polymorphism:
Question:
Implement a class hierarchy for Vehicles with a base class Vehicle that contains 
a method startEngine(). Derive two classes: Car and Motorcycle, both overriding the 
startEngine() method to print different messages indicating how their engines are started. 
Create a method vehicleTestDrive(Vehicle vehicle) that accepts any object of type Vehicle 
and calls its startEngine() method. Demonstrate polymorphism by passing different 
vehicle objects to this method.*/


// Base class
class Vehicle {
    // Method to be overridden
    void startEngine() {
        System.out.println("Starting the vehicle's engine...");
    }
}

// Derived class: Car
class Car extends Vehicle {
    // Overriding startEngine() method
    @Override
    void startEngine() {
        System.out.println("Car engine starting with a key ignition...");
    }
}

// Derived class: Motorcycle
class Motorcycle extends Vehicle {
    // Overriding startEngine() method
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starting with a self-start button...");
    }
}

// Method to demonstrate polymorphism
public class VehicleDemo {
    // Method accepting any Vehicle type and calling startEngine()
    static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine(); // Dynamic method dispatch (polymorphism)
    }

    public static void main(String[] args) {
        Vehicle myCar = new Car();          // Creating Car object
        Vehicle myMotorcycle = new Motorcycle();  // Creating Motorcycle object

        // Demonstrating polymorphism
        vehicleTestDrive(myCar);          // Calls Car's startEngine()
        vehicleTestDrive(myMotorcycle);   // Calls Motorcycle's startEngine()
    }
}
