package Transport;

import java.util.List;

public class Truck extends Transport <DriveC> implements Competing {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;
    private loadCapacity loadCapacity;


    public Truck(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, loadCapacity loadCapacity, List<Mechanic> mechanicList ) {
        super(brand, model, engineVolume, maxSpeed, mechanicList);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.loadCapacity = loadCapacity;
        this.mechanicList = mechanicList;
    }

    public loadCapacity getLoadCapacity () {return loadCapacity;}

    public void setLoadCapacity (loadCapacity loadCapacity) {this.loadCapacity = loadCapacity;}


    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    boolean passDiagnostics() {
        System.out.println(getBrand() + getModel() + " Необходимо пройти диагностику ");
        return true;
    }

    void startMove() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void finish() {

    }

    void finishMove() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Пит-Стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Макс скорость" + maxSpeed);
    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время" + bestLapTime);

    }

    @Override
    public String repair() {
        return " Чиним двигатель ";

    }
}