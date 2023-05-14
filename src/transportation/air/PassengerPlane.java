package transportation.air;

import transportation.PassengerTransport;

public class PassengerPlane extends Aircraft implements PassengerTransport {

    private int passengerCapacity;
    private int numberOfPassengers;

    // Getter and Setter


    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    // methods
    @Override
    public int calculationOfPassengersCarried(int numberOfFlights) {
        return 0;
    }
}
