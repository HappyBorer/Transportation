package transportation.air;

import transportation.Transportation;

public class Aircraft extends Transportation {
    private int crewComposition; // Состав экипажа
    private int numberOfEngines; // Количество двигателей
    private double enginePower; // Мощностью
    private double volumeOfFuelTanks; // Объем топливных баков
    private double wingspan; // Размах крыла
    private double cruisingSpeed; // крейсерская скорость
    private double safetyFactor; // коэффициент безопасности

    {
        safetyFactor = 0.3;
    }

    // Getter and Setter


    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getSafetyFactor() {
        return safetyFactor;
    }

    public void setSafetyFactor(double safetyFactor) {
        this.safetyFactor = safetyFactor;
    }

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

    // Выпустить шасси
    public void releaseChassis(){
        System.out.println("Chassis released");
    }

    // Убрать шасси
    public void retractTheChassis(){
        System.out.println("The landing gear is retracted.");
    }

    // Запустить двигатель
    public void runEngine(){
        for(int i = 0; i < numberOfEngines; i++){
            System.out.println("engine started.");
        }
    }

    // Остановка двигателей
    public void stoppingTheEngines(){
        System.out.println("Engines stopped.");
    }

    @Override
    public void calculationOfTheAmountOfEnergyForTransportation(double fuelConsumption, double travelTime){
        double result = fuelConsumption * travelTime * safetyFactor;
        System.out.println("Required amount of fuel " + result);
    }
}
