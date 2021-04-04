package A04EncapsulationEx.E01ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = scan.nextDouble();
        double width = scan.nextDouble();
        double height = scan.nextDouble();

        Box box = new Box(length, width, height);

        System.out.println(box);
    }
}
