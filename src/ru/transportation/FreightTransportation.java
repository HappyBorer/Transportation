package ru.transportation;

public interface FreightTransportation {
  void loadingCargo(double cargoWeight);
  void unloadingCargo(double cargoWeight);

  boolean isDownload();
}
