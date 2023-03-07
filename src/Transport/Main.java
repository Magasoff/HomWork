package Transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //  DriveB driveB = new DriveB("Сидоров", true, 5);
        // lightCar lightCar = new lightCar("Лада", "Гранта", 1.6, 10, 90, 10, bodyCar.Type3);
        // lightCar.printType();
        // DriveC driveC = new DriveC("Петров", true, 10);
        // Truck truck = new Truck("Мазда", "Маз", 4.2, 100, 90, 10, loadCapacity.getValue(12));
        // truck.printType();
        //  DriveD driveD = new DriveD("Козлов", true, 10);
        //  Bus bus = new Bus("Икарус", "Икар", 2.4, 100, 90, 15, Size.getValue(20), List.of(new Mechanic("Иванов", "ЗБС")));
        //  bus.printType();
        //  printInfo(lightCar);
        //  printInfo(truck);
        //  printInfo(bus);

        Mechanic mechanicIvan = new Mechanic("Иван", "Восток-авто");
        Mechanic mechanicAndrei = new Mechanic("Андрей", "Авто-дом");
        Mechanic mechanicArkadiy = new Mechanic("Аркадий", "Збс - авто");

        DriveB driveB1 = new DriveB("Игорь", true, 10);
        DriveD driveD1 = new DriveD("Петр", true, 19);
        DriveC driveC1 = new DriveC("Олег", true, 12);

        lightCar lightCar1 = new lightCar("Лада", "Приора", 1.5, 20, 190, 20,
                bodyCar.Type1, List.of(mechanicIvan));
        Bus bus1 = new Bus("Икарус", "Парус", 1.8, 40, 90, 20, Size.getValue(20), List.of(mechanicAndrei));
        Truck truck1 = new Truck("Рено", "Ман", 4.4, 50, 90, 20, loadCapacity.getValue(20), List.of(mechanicArkadiy));


        List<Transport> racers = new ArrayList<>();

        racers.add(lightCar1);
        racers.add(bus1);
        racers.add(truck1);

        mechanicIvan.fixTheCar(lightCar1);
        mechanicIvan.performMaintenance(lightCar1);

        mechanicAndrei.fixTheCar(truck1);
        mechanicAndrei.performMaintenance(truck1);


        Map<Transport, List<Mechanic>> transportandmechanics = new HashMap<>();
        lightCar lightCar = new lightCar("Опель", "корса", 1.4, 20, 190, 20, bodyCar.Type2, List.of(mechanicIvan));
        transportandmechanics.put(lightCar, lightCar.getMechanics());

        for (Map.Entry<Transport, List<Mechanic>> map : transportandmechanics.entrySet()) {
            System.out.println(map);
        }
        Set<Drive> driveSet = new HashSet<>();
        List<Drive> drives = new ArrayList<>();
        drives.add(driveB1);
        drives.add(driveD1);

        for (Drive drive : drives) {
            driveSet.add(drive);
        }
        Iterator<Drive> iterator = driveSet.iterator();

        while (iterator.hasNext()) {
            Drive drive = iterator.next();
            System.out.println(drive);
        }
    }
}




        //    try {
        //        System.out.println(lightCar.getBrand() + " " + lightCar.getModel() + lightCar.passDiagnostics()); //
        //       System.out.println(truck.getBrand() + " " + truck.getModel() + truck.passDiagnostics());
        //       System.out.println(bus.getBrand() + " " + bus.getModel() + bus.passDiagnostics());
        //   } catch (RuntimeException e) {
        //       System.out.println(e.getMessage());


//    private static void printInfo(Transport<?> transport) {
//   System.out.println(" Водитель управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " будет участвовать в заезде ");
