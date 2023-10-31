package CarServices;

import java.time.LocalDate;

public class Parts {
    private String ID;
    private LocalDate boughtDate;
    private int amount;
    private boolean inStock;
    private double unitCost;

    public Parts(String ID, LocalDate boughtDate, int amount, boolean inStock, double unitCost) {
        this.ID = ID;
        this.boughtDate = boughtDate;
        this.amount = amount;
        this.inStock = inStock;
        this.unitCost = unitCost;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public LocalDate getBoughtDate() {
        return boughtDate;
    }

    public void setBoughtDate(LocalDate boughtDate) {
        this.boughtDate = boughtDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
