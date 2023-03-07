package Transport;

import java.util.List;

public abstract class Transport <T extends Drive> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    public List <Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, int maxSpeed, List <Mechanic> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanicList = mechanicList;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public List<Mechanic> getMechanics() {
        return mechanicList;
    }

    public boolean checkNeedTransportService () {
        try {
            passDiagnostics();
        } catch (transportTypeException e) {
            return false;
        }
        return true;
    }

    abstract void startMove();

    abstract void finish();

    abstract void finishMove();

    @Override
    public abstract void getPitStop();

    public abstract void getBestLapTime();

    public abstract void getBestTime();

    public abstract void getMaxSpeed();

    //public abstract boolean diagnostics();

    public abstract void printType ();

    abstract boolean passDiagnostics () throws transportTypeException;

    public abstract String repair ();


    @Override
    public String toString() {
        return " Транспорт: " +  "марка: " + brand + " модель " + model + " " + engineVolume + " объем двигателя " + " обслуживается механиком "+ mechanicList;
    }
}



