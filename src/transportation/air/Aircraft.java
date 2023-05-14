package transportation.air;

import transportation.Transportation;

public class Aircraft extends Transportation {
    private int crewComposition;
    private int numberOfEngines;
    private double enginePower;
    private double volumeOfFuelTanks;
    private double wingspan;
    // Getter and Setter

    public int getCrewComposition() {
        return crewComposition;
    }

    public void setCrewComposition(int crewComposition) {
        this.crewComposition = crewComposition;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getVolumeOfFuelTanks() {
        return volumeOfFuelTanks;
    }

    public void setVolumeOfFuelTanks(double volumeOfFuelTanks) {
        this.volumeOfFuelTanks = volumeOfFuelTanks;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    //methods

    public void releaseChassis(){
        System.out.println("Chassis released");
    }

    public void retractTheChassis(){
        System.out.println("The landing gear is retracted.");
    }

    public void runEngine(){
        for(int i = 0; i < numberOfEngines; i++){
            System.out.println("engine started.");
        }
    }
    public void stoppingTheEngines(){
        System.out.println("Engines stopped.");
    }

    @Override
    public void getTheRemainingFuel(double fuelFromStart, double distanceTraveled) {

    }
}
