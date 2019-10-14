import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();

        Point point = new Point();

        String result = ("Punkt"  + "(" + x + "," + y + ")" + " leży w " + point.quarter(x, y) + "ćwiartce układu współrzędnych.");

        System.out.println(result);
    }
}
