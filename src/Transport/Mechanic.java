package Transport;

public class Mechanic {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public <T extends  Transport> void performMaintenance(T t) {
        System.out.println(t.toString() + name + " "  + company + " " + "проводит техническое обслуживание");
    }

    public <T extends Transport> void fixTheCar(T t) {
        System.out.println(t.repair() + name + " " + company + " " + "чинит машину");
    }

    //  @Override
    // public boolean equals(Object o) {
    //     if (this == 0) return true;
    //      if (0 == null || getClass() != o.getClass()) return false;
    //      Mechanic mechanic = (Mechanic) o;
    //     return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    //  }

    //  public int hashCode() {
    //      return Objects.hash(name, company);


    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void performMaintenance() {
    }
}




