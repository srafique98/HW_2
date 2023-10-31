package CarServices;

import java.time.LocalDate;

public class Vehicle {

    private LocalDate modelYear;
    private String model;
    private String make;
    private LocalDate manufactureDate;

    public Vehicle(LocalDate modelYear, String model, String make, LocalDate manufactureDate) {
        this.modelYear = modelYear;
        this.model = model;
        this.make = make;
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getModelYear() {
        return modelYear;
    }

    public void setModelYear(LocalDate modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isOlderThan(int years) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - manufactureDate.getYear() > years;
    }
}
