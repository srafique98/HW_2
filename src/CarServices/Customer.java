package CarServices;

public class Customer {
    private String firstName;
    private String lastName;
    private Service service;

    public Customer(String firstName, String lastName, Service service) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.service = service;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    // Method with logic
    public double calculateServiceCost() {
        if (service != null) {
            return this.service.getServiceCost();
        } else {
            return 0.0;
        }
    }

    // Overloaded method
    public void printCustomerDetails() {
        System.out.println("Customer Name: " + firstName + " " + lastName);
        if (service != null) {
            System.out.println("Selected Service: " + service.getServiceName());
            System.out.println("Service Cost: $" + calculateServiceCost());
        } else {
            System.out.println("No service selected.");
        }
    }


}
