package ru.transportation.wheeled;

import ru.transportation.FreightTransportation;
import ru.transportation.Transportation;

public class Truck extends Transportation implements FreightTransportation {

  @Override
  public void loadingCargo(double cargoWeight) {

  }

  @Override
  public void unloadingCargo(double cargoWeight) {

  }

  @Override
  public boolean isDownload() {
    return false;
  }

  @Override
  public void moveTo(String address) {

  }
}
