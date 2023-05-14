package transportation.air;

import transportation.FreightTransport;

public class Freighter extends Aircraft implements FreightTransport {

    private double maximumLoadHeight;
    private double maximumLoadWidth;
    private double maximumLoadLength;
    private int loadCapacity;

    Freighter(String vehicleName){
       super.setVehicleName(vehicleName);
    }
    // Getter and Setter


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getMaximumLoadHeight() {
        return maximumLoadHeight;
    }

    public void setMaximumLoadHeight(double maximumLoadHeight) {
        this.maximumLoadHeight = maximumLoadHeight;
    }

    public double getMaximumLoadWidth() {
        return maximumLoadWidth;
    }

    public void setMaximumLoadWidth(double maximumLoadWidth) {
        this.maximumLoadWidth = maximumLoadWidth;
    }

    public double getMaximumLoadLength() {
        return maximumLoadLength;
    }

    public void setMaximumLoadLength(double maximumLoadLength) {
        this.maximumLoadLength = maximumLoadLength;
    }

    // methods
    @Override
    public double calculationOfFuelFromLoad(double distance, double cargoWeight) {
        return 0;
    }
}
