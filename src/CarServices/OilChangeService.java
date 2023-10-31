package CarServices;

public class OilChangeService {
    private String oilType;
    private int oilChangeInterval;

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public int getOilChangeInterval() {
        return oilChangeInterval;
    }

    public void setOilChangeInterval(int oilChangeInterval) {
        this.oilChangeInterval = oilChangeInterval;
    }


    public void printOilChangeService() {
        System.out.println("Oil Type: " + oilType);
        System.out.println("Oil Change Interval: " + oilChangeInterval + " months");
    }

}
