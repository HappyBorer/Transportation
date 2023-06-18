package transportation.air;

import transportation.FreightTransport;

public class Freighter extends Aircraft implements FreightTransport {

    private double maximumLoadHeight; // Максимальная высота груза
    private double maximumLoadWidth; // Максимальная ширина груза
    private double maximumLoadLength; // Максимальна длина груза
    private int loadCapacity; // Грузоподъемность

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

    // Расчет стоимости перевозки
    @Override
    public double freightEstimation(double distance, double cargoWeight) {
        return 0;
    }
}
