package transportation;

public abstract class Transportation {
    String vehicleName; // Названиет транспортного средства

    String typeOfGeographicEnvironment; // Тип географической среды
    String waysOfCommunication; // Способы коммуникации
    String energySource; // Источник энергии

    // Getter and Setter


    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getTypeOfGeographicEnvironment() {
        return typeOfGeographicEnvironment;
    }

    public void setTypeOfGeographicEnvironment(String typeOfGeographicEnvironment) {
        this.typeOfGeographicEnvironment = typeOfGeographicEnvironment;
    }

    public String getWaysOfCommunication() {
        return waysOfCommunication;
    }

    public void setWaysOfCommunication(String waysOfCommunication) {
        this.waysOfCommunication = waysOfCommunication;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    // methods
    public void description(){
        System.out.printf("Vehicle name: %s, type of geographic environment: %s, ways of communication: %s, energy source: %s",
                vehicleName, typeOfGeographicEnvironment, waysOfCommunication, energySource);
    }

    public abstract void calculationOfTheAmountOfEnergyForTransportation(double powerConsumption, double distance); // Расчет количества энергии для транспортировки
}
