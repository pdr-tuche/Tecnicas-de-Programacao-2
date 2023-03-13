package exercicio.tresequatro;

public class Employee {
    private int plate;
    private String name;
    private String departament;
    private float salary;
    private String function;

    public Employee() {
    }

    public Employee(int plate, String name, String departament, float salary, String function) {
        this.plate = plate;
        this.name = name;
        this.departament = departament;
        this.salary = salary;
        this.function = function;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "plate=" + plate +
                ", name='" + name + '\'' +
                ", departament='" + departament + '\'' +
                ", salary=" + salary +
                ", function='" + function + '\'' +
                '}';
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
