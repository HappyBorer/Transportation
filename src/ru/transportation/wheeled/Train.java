package ru.transportation.wheeled;

import ru.transportation.FreightTransportation;
import ru.transportation.PassengerTransportation;
import ru.transportation.Transportation;

import java.util.SortedMap;

public class Train extends Transportation implements PassengerTransportation, FreightTransportation {
  private String numberTrain;
  private int places;

  private int counterPlace = 0;
  private double counterCapacity = 0;
  private double liftingCapacity;

  public Train(){}

  public Train(String numberTrain, int places, double liftingCapacity) {
    this.numberTrain = numberTrain;
    this.places = places;
    this.liftingCapacity = liftingCapacity;
  }

  public Train(String model, String series, int yearOfIssue, String manufacturerCountry, String numberTrain, int places, double liftingCapacity) {
    super(model, series, yearOfIssue, manufacturerCountry);
    this.numberTrain = numberTrain;
    this.places = places;
    this.liftingCapacity = liftingCapacity;
  }

  @Override
  public void plantingPassengers(int numberOfPersons) {
      counterPlace += numberOfPersons;
      if(isPlaces()){
        System.out.println("Landing completed");
      }else{
        System.out.println("Reduce the number of passengers");
        counterPlace -= numberOfPersons;
      }
  }

  @Override
  public void passengerLanding(int numberOfPersons) {
      if(numberOfPersons <= counterPlace){
        counterPlace -= numberOfPersons;
        System.out.println("Disembarkation completed");
      }else{
        System.out.println("It is impossible to disembark such a number of passengers");
      }

  }

  @Override
  public boolean isPlaces() {
    return counterPlace < places;
  }


  @Override
  public void loadingCargo(double cargoWeight) {
    counterCapacity += cargoWeight;
    if(isDownload()){
      System.out.println("Loading successful");
    }else{
      counterCapacity -= cargoWeight;
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

  public int getCounterPlace() {
    return counterPlace;
  }

  public String getNumberTrain() {
    return numberTrain;
  }

  public void setNumberTrain(String numberTrain) {
    this.numberTrain = numberTrain;
  }

  public int getPlaces() {
    return places;
  }

  public void setPlaces(int places) {
    this.places = places;
  }

  public double getLiftingCapacity() {
    return liftingCapacity;
  }

  public void setLiftingCapacity(double liftingCapacity) {
    this.liftingCapacity = liftingCapacity;
  }

  public double getCounterCapacity() {
    return counterCapacity;
  }
}
