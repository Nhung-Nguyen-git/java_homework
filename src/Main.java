
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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
        System.out.println(employee);
         
    }
    
    }
