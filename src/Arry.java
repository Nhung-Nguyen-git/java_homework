import java.util.Scanner;

public class Arry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("moi ban nhap vao so thu" +(i + 1));
            int x = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
    }
}
