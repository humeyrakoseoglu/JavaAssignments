package Question9_10;

public class Employee extends Person{
    protected double salary;

    public Employee(String name) {
        super(name);
    }


    public int getSalary() {
        return (int)salary;
    }
}
