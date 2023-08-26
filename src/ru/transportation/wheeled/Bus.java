package ru.transportation.wheeled;

import ru.transportation.PassengerTransportation;
import ru.transportation.Transportation;

public class Bus extends Transportation implements PassengerTransportation {
  private int numberOfSeats;
  private boolean baggageCompartment;

  public Bus(String model, String series, int yearOfIssue, String manufacturerCountry, int numberOfSeats,
      boolean baggageCompartment) {
    super(model, series, yearOfIssue, manufacturerCountry);
    this.numberOfSeats = numberOfSeats;
    this. baggageCompartment = baggageCompartment;
  }

  // Setter and Getter


  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public boolean isBaggageCompartment() {
    return baggageCompartment;
  }

  public void setBaggageCompartment(boolean baggageCompartment) {
    this.baggageCompartment = baggageCompartment;
  }

  // methods

  public void description(){
    super.description();
    System.out.printf("number of seats: %d, baggage compartment: %s", numberOfSeats,
        baggageCompartment?"Yes":"No");
  }
  @Override
  public void plantingPassengers(int numberOfPersons) {
    if(numberOfPersons >= numberOfSeats){
      int result = numberOfPersons - numberOfSeats;
      if(result > 0) {
        System.out.println(
            "The bus is full! The remaining " + result + " passengers wait for the next flight");
      }else{
        System.out.println("The bus is full!");
      }
    }else{
      System.out.println("Passengers got on the bus! The remaining places " + (numberOfSeats - numberOfPersons));
    }
  }

  @Override
  public void passengerLanding(int numberOfPersons) {

  }

  @Override
  public double calculateTheTimeOfThePath() {
    return 0;
  }
}
