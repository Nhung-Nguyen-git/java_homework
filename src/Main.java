import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho:");
        String nameGoods = sc.nextLine();
        System.out.println(nameGoods);
        System.out.println("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd):");
        String birthDate = sc.nextLine();
        LocalDate lcd = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(lcd);

        System.out.println("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss)");
        String importGoods = sc.nextLine();
        LocalDateTime lcdt = LocalDateTime.parse(importGoods,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(lcdt);

        System.out.println("Mời bạn nhập thời gian (HH:mm:ss)");
        String time = sc.nextLine();
        LocalTime timeExport = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(timeExport);
        }
    }
