
import CarServices.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Instantiate Location
        Location location1 = new Location("Branch A", LocalDate.of(2020, 5, 10), 4.5, 100);
        Location location2 = new Location("Branch B", LocalDate.of(2018, 8, 15), 4.2, 80);

        // Instantiate Parts
        Parts part1 = new Parts("P001", LocalDate.of(2023, 1, 15), 100, true, 50.0);
        Parts part2 = new Parts("P002", LocalDate.of(2022, 11, 20), 50, true, 30.0);

        // Instantiate Service
        Service service1 = new Service("Service 1", LocalDate.of(2023, 3, 1), 100.0);
        Service service2 = new Service("Service 2", LocalDate.of(2023, 3, 10), 120.0);

        // Instantiate Customer
        Customer customer1 = new Customer("John", "Doe", service1);
        Customer customer2 = new Customer("Alice", "Smith", service2);

        // Instantiate CarRepairService
        CarRepairService repairService1 = new CarRepairService("Engine Repair", 500.0);
        CarRepairService repairService2 = new CarRepairService("Brake Replacement", 300.0);

        System.out.println("Car repair service instantiated.");

        // Instantiate CarWashService
        CarWashService carWash1 = new CarWashService("Standard Wash");
        CarWashService carWash2 = new CarWashService("Deluxe Wash");

        System.out.println("Car wash service instantiated.");

        // Instantiate SmogCheck
        SmogCheck smogCheck1 = new SmogCheck();
        SmogCheck smogCheck2 = new SmogCheck();

        smogCheck1.setPassedInspection(true);
        smogCheck2.setPassedInspection(false);

        System.out.println("Smog checks instantiated.");

        // Instantiate TireReplacementService
        TireReplacementService tireReplacement1 = new TireReplacementService();
        TireReplacementService tireReplacement2 = new TireReplacementService();

        tireReplacement1.setNumberOfTires(4);
        tireReplacement1.setTireBrand("Michelin");

        tireReplacement2.setNumberOfTires(2);
        tireReplacement2.setTireBrand("Goodyear");

        System.out.println("Tire replacement service instantiated.");

        // Instantiate Vehicle
        Vehicle vehicle1 = new Vehicle(LocalDate.of(2020, 1, 1), "SUV", "Toyota", LocalDate.of(2020, 1, 1));
        Vehicle vehicle2 = new Vehicle(LocalDate.of(2018, 1, 1), "Sedan", "Honda", LocalDate.of(2018, 1, 1));

        System.out.println("Vehicles instantiated.");

        // Instantiate OilChangeService
        OilChangeService oilChangeService1 = new OilChangeService();
        OilChangeService oilChangeService2 = new OilChangeService();

        oilChangeService1.setOilType("Synthetic");
        oilChangeService1.setOilChangeInterval(6);

        oilChangeService2.setOilType("Conventional");
        oilChangeService2.setOilChangeInterval(3);

        System.out.println("Oil change service instantiated.");

        // Print completion message
        System.out.println("All objects have been instantiated.");

    }
}