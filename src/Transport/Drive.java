package Transport;

public abstract class Drive {
    private String name;
    private boolean driveLicense;
    private int experinse;

    public Drive(String name, boolean driveLicense, int experinse) {
        this.name = name;
        this.driveLicense = driveLicense;
        this.experinse = experinse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getExperinse() {
        return experinse;
    }

    public void setExperinse(int experinse) {
        this.experinse = experinse;
    }

    @Override
    public String toString() {
        return name + " категория прав: " + driveLicense + " водительский стаж: " + experinse;
    }

    public abstract void startMove();

    public abstract void finish();

    public abstract void refill();
}


