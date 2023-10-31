package CarServices;

import java.time.LocalDate;

public class Location {
    private String branchName;
    private LocalDate establishedDate;
    private double ratings;
    private int capacity;
    // Static variable
    private static int locationCount = 0;

    public Location(String branchName, LocalDate establishedDate, double ratings, int capacity) {
        this.branchName = branchName;
        this.establishedDate = establishedDate;
        this.ratings = ratings;
        this.capacity = capacity;
        locationCount++;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setName(String branchName) {
        this.branchName = branchName;
    }

    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setOpeningDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int yearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - establishedDate.getYear();
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public double getRatings() {
        return this.ratings;
    }

    public static int getLocationCount() {
        return locationCount;
    }

}
