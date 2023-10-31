package CarServices;

public class CarRepairService {
    private String repairDescription;
    private boolean isComplete;
    private double repairCost;

    public CarRepairService(String repairDescription, boolean isComplete, double repairCost) {
        this.repairDescription = repairDescription;
        this.isComplete = isComplete;
        this.repairCost = repairCost;
    }

    public CarRepairService(String repairDescription, double repairCost) {
        this.repairDescription = repairDescription;
        this.repairCost = repairCost;
        this.isComplete = isComplete;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    public void performRepair() {
        if (!isComplete) {
            System.out.println("Performing repair: " + repairDescription);
            isComplete = true;
        } else {
            System.out.println("Repair is already complete.");
        }
    }

    public void performRepair(double cost) { //Overloading
        if (!isComplete) {
            performRepair();
            setRepairCost(cost);
        } else {
            System.out.println("Repair is already complete.");
        }
    }

}
