package transportation;

public abstract class Transportation {
    String vehicle;
    String tripType;
    String TrackConstruction;
    int maximumSpeed;
    int passengerCapacity;
    int loadCapacity;

    // Getter and Setter


    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getTrackConstruction() {
        return TrackConstruction;
    }

    public void setTrackConstruction(String trackConstruction) {
        TrackConstruction = trackConstruction;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
