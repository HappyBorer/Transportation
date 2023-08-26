package ru.transportation.wheeled;

import ru.transportation.FreightTransportation;
import ru.transportation.PassengerTransportation;
import ru.transportation.Transportation;

public class Train extends Transportation implements PassengerTransportation, FreightTransportation {

  @Override
  public void loading(double cargoWeight) {

  }

  @Override
  public void unloading(double cargoWeight) {

  }

  @Override
  public void plantingPassengers(int numberOfPersons) {

  }

  @Override
  public void passengerLanding(int numberOfPersons) {

  }

  @Override
  public double calculateTheTimeOfThePath() {
    return 0;
  }
}
