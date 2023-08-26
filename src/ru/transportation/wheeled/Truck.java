package ru.transportation.wheeled;

import ru.transportation.FreightTransportation;
import ru.transportation.Transportation;

public class Truck extends Transportation implements FreightTransportation {

  @Override
  public void loading(double cargoWeight) {

  }

  @Override
  public void unloading(double cargoWeight) {

  }

  @Override
  public double calculateTheTimeOfThePath() {
    return 0;
  }
}
