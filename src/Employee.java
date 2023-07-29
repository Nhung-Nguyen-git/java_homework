import java.util.Scanner;

public class Employee  extends Person{

    final double exp;
    final String placeWork;

    public Employee(int id, String name, String address, int age, double exp, String placeWork) {
        super(id, name, address, age);
        this.exp = exp;
        this.placeWork = placeWork;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "exp=" + exp +
                ", placeWork='" + placeWork + '\'' +
                "} " + super.toString();
    }
}
