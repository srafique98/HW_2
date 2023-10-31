package CarServices;

import java.time.LocalDate;

public class Service {
    private String serviceName;
    private LocalDate serviceDate;
    private double serviceCost;
    private static int totalServicesPerformed = 0;

    public Service(String serviceName, LocalDate serviceDate, double serviceCost) {
        this.serviceName = serviceName;
        this.serviceDate = serviceDate;
        this.serviceCost = serviceCost;
        totalServicesPerformed++;
//        specialDiscount();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public static int getTotalServicesPerformed() {
        return totalServicesPerformed;
    }

    public static void setTotalServicesPerformed(int totalServicesPerformed) {
        Service.totalServicesPerformed = totalServicesPerformed;
    }
}
