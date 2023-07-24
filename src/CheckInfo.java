import java.util.Locale;
import java.util.Scanner;

public class CheckInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        do{
            System.out.println(" Input student name :");
            String name = sc.nextLine();
            System.out.println(" Input address :");
            String address = sc.nextLine();
            System.out.println(" Input student age  :");
            int age = Integer.parseInt(sc.nextLine());
            System.out.printf( "Information of the student \n name: %s  address: %s age : %d \n",name ,address, age);
            System.out.println("Do you want to continues?(Y/N)");
             answer = sc .nextLine().toUpperCase(Locale.ROOT);


        }while (answer.equals("Y"));

    }

}
