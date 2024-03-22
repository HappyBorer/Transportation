import ru.transportation.air.Airplane;
import ru.transportation.water.Tanker;
import ru.transportation.wheeled.Train;
import ru.transportation.wheeled.Truck;

public class Runner {
    public static void main(String[] args) {
        Truck kamaz = new Truck("Kamaz - 215", "HJ45JKH", 2015, "Russia",
                "dump truck", 20000);
        Train train  = new Train("jjkh", "hhdvc87", 2000, "England",
                "123HT", 500, 500000);
        Tanker tanker = new Tanker("TITAN", "hkjhkjh596", 2009, "Russia",
                "FSO", 320000);
        Airplane airplane = new Airplane("BOEING", "jbghkjhk6547", 2010, "USA",
                "Bird", 600);

        kamaz.loadingCargo(3000);
        System.out.println(kamaz.getCounterCapacity());
        kamaz.moveTo("City");
        train.loadingCargo(9000);
        train.plantingPassengers(150);
        train.moveTo("Prostocvashino");
        System.out.println(train.getCounterPlace());
        System.out.println(train.getCounterCapacity());
        tanker.loadingCargo(60000);
        tanker.moveTo("East");
        System.out.println(tanker.getCounterVolume());
        airplane.plantingPassengers(500);
        airplane.moveTo("Sochi");
        System.out.println(airplane.getCounterSeats());

    }
}
