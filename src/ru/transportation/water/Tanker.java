package ru.transportation.water;

import ru.transportation.FreightTransportation;
import ru.transportation.Transportation;

public class Tanker extends Transportation implements FreightTransportation {
    private String type;

    private double volume;
    private double counterVolume = 0;

    public Tanker(){}

    public Tanker(String type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    public Tanker(String model, String series, int yearOfIssue, String manufacturerCountry, String type, double volume) {
        super(model, series, yearOfIssue, manufacturerCountry);
        this.type = type;
        this.volume = volume;
    }

    @Override
    public void loadingCargo(double cargoWeight) {
        counterVolume += cargoWeight;
        if(isDownload()){
            System.out.println("Loading successful");
        }else{
            counterVolume -= cargoWeight;
            System.out.println("Overload");
        }

    }

    @Override
    public void unloadingCargo(double cargoWeight) {
        if(cargoWeight <= counterVolume){
            counterVolume -= cargoWeight;
            System.out.println("Upload successful");
        }else{
            System.out.println("There is no such amount of cargo");
        }
    }

    @Override
    public boolean isDownload() {
        return counterVolume < volume;
    }

    @Override
    public void moveTo(String address) {
        System.out.println(this.getClass().getSimpleName() + " transports to " + address);
    }

    public double getCounterVolume() {
        return counterVolume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
