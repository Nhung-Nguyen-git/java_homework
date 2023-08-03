import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Bus name");
        String busName = sc.nextLine();
        System.out.println("Input distance bus");
        double distanceBus = Double.parseDouble(sc.nextLine());
        Bus bus = new Bus(busName,distanceBus);

        System.out.println("Input Plane name");
        String planeName = sc.nextLine();
        System.out.println("Input distance plane");
        double distancePlane = Double.parseDouble(sc.nextLine());
        Plane plane = new Plane(planeName,distancePlane);



        System.out.println("Input train name");
        String trainName = sc.nextLine();
        System.out.println("Input distance train");
        double distanceTrain = Double.parseDouble(sc.nextLine());
        Train train = new Train(trainName, distanceTrain);

        ManageVehicle manageVehicle = new ManageVehicle();
        manageVehicle.setBus(bus);
        manageVehicle.setPlane(plane);
        manageVehicle.setTrain(train);

        System.out.println(manageVehicle);

    }
}

