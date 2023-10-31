package CarServices;

public class CarWashService {
    private String washType;
    private boolean isCleaned;

    public CarWashService(String washType, boolean isCleaned) {
        this.washType = washType;
        this.isCleaned = isCleaned;
    }

    public CarWashService(String washType) {
        this.washType = washType;
        this.isCleaned = false;
    }

    public void cleanCar() {
        if (!isCleaned) {
            System.out.println("Cleaning the car with " + washType + " wash.");
            isCleaned = true;
        } else {
            System.out.println("Car is already cleaned.");
        }
    }


}
