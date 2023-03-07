package Transport;

public class DriveC extends Drive {
    public DriveC(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав C " + getName() + "начал движение");
    }

    @Override
    public void finish() {

        System.out.println("Водитель с категорией прав C " + getName() + "закончил движение");
    }


    public void refill() {
        System.out.println("Водитель с категорией прав C " + getName() + "заправляет авто");
    }
}


