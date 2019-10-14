import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        Point point = new Point();
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());

        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());
        scanner.close();

        System.out.println(point.result());
    }
}
