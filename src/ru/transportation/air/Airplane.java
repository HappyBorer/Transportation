package ru.transportation.air;

import ru.transportation.PassengerTransportation;
import ru.transportation.Transportation;

public class Airplane extends Transportation implements PassengerTransportation {
    private String name;
    private int seatsForPassengers;
    private int counterSeats = 0;

    public Airplane(){};

    public Airplane(String name, int seatsForPassengers) {
        this.name = name;
        this.seatsForPassengers = seatsForPassengers;
    }

    public Airplane(String model, String series, int yearOfIssue, String manufacturerCountry, String name, int seatsForPassengers) {
        super(model, series, yearOfIssue, manufacturerCountry);
        this.name = name;
        this.seatsForPassengers = seatsForPassengers;
    }

    @Override
    public void plantingPassengers(int numberOfPersons) {
        counterSeats += numberOfPersons;
        if(isPlaces()){
            System.out.println("Landing completed");
        }else{
            System.out.println("Reduce the number of passengers");
            counterSeats -= numberOfPersons;
        }
    }

    @Override
    public void passengerLanding(int numberOfPersons) {
        if(numberOfPersons <= counterSeats){
            counterSeats -= numberOfPersons;
            System.out.println("Disembarkation completed");
        }else{
            System.out.println("It is impossible to disembark such a number of passengers");
        }
    }

    @Override
    public boolean isPlaces() {
        return counterSeats < seatsForPassengers;
    }

    @Override
    public void moveTo(String address) {
        System.out.println(this.getClass().getSimpleName() + " transports to " + address);
    }

    public int getCounterSeats() {
        return counterSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsForPassengers() {
        return seatsForPassengers;
    }

    public void setSeatsForPassengers(int seatsForPassengers) {
        this.seatsForPassengers = seatsForPassengers;
    }
}
