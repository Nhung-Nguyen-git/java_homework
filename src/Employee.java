import java.util.Scanner;

public class Employee  extends Person{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter address:");
        String address = sc.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Exp :");
        double exp = Double.parseDouble (sc.nextLine());
        System.out.println("Enter Place Work:");
        String placeWork = sc.nextLine();
        Employee employee = new Employee(id, name,address,age,exp,placeWork);
        System.out.printf(String.valueOf(employee));
    }





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
