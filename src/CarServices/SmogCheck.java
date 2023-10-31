package CarServices;

import java.time.LocalDate;

public class SmogCheck {
    private boolean passedInspection;
    private LocalDate nextSmogCheck;


    public boolean isPassedInspection() {
        return passedInspection;
    }

    public void setPassedInspection(boolean passedInspection) {
        this.passedInspection = passedInspection;
    }

    public LocalDate getNextSmogCheck() {
        return nextSmogCheck;
    }

    public void setNextSmogCheck(LocalDate nextSmogCheck) {
        this.nextSmogCheck = nextSmogCheck;
    }

    public void printCarInspection() {
        System.out.println("Inspection Result: " + (passedInspection ? "Passed" : "Failed"));
    }


}
