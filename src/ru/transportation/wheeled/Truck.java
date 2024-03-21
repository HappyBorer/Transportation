package ru.transportation.wheeled;

import ru.transportation.FreightTransportation;
import ru.transportation.Transportation;

public class Truck extends Transportation implements FreightTransportation {
  private String name;
  private double liftingCapacity;

  private double counterCapacity = 0;


  public Truck(){}
  public Truck(String name, double liftingCapacity) {
    this.name = name;
    this.liftingCapacity = liftingCapacity;
  }

  public Truck(String model, String series, int yearOfIssue, String manufacturerCountry, String name, double liftingCapacity) {
    super(model, series, yearOfIssue, manufacturerCountry);
    this.name = name;
    this.liftingCapacity = liftingCapacity;
  }

  @Override
  public void loadingCargo(double cargoWeight) {
    counterCapacity += cargoWeight;
    if(isDownload()){
      System.out.println("Loading successful");
    }else{
      counterCapacity-= cargoWeight;
      System.out.println("Overload");
    }
  }

  @Override
  public void unloadingCargo(double cargoWeight) {
    if(cargoWeight <= counterCapacity){
      counterCapacity -= cargoWeight;
      System.out.println("Upload successful");
    }else{
      System.out.println("There is no such amount of cargo");
    }
  }

  @Override
  public boolean isDownload() {
    return counterCapacity < liftingCapacity;
  }

  @Override
  public void moveTo(String address) {
    System.out.println(this.getClass().getSimpleName() + " transports to " + address);
  }

  public double getCounterCapacity() {
    return counterCapacity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getLiftingCapacity() {
    return liftingCapacity;
  }

  public void setLiftingCapacity(double liftingCapacity) {
    this.liftingCapacity = liftingCapacity;
  }
}
