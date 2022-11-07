import java.util.Objects;

public class Employee {

    private String fullName;
    private  int  deperament;
    private int salary;
    private  int id ;

    public static int counter = 0;

    public Employee(String fullName, int salary, int deperament) {
        this.fullName = fullName;
        this.deperament = deperament;
        this.salary= salary;
        id = counter++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getDeperament() {
        return deperament;
    }

    public float getSalary() {
        return salary;
    }

public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "." + fullName + ".  зароботная плата = " + salary + " ОТДЕЛ № " + deperament;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return deperament == employee.deperament && salary == employee.salary && id == employee.id && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, deperament, salary, id);
    }
}
