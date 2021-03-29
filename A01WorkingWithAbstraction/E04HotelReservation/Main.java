package A01WorkingWithAbstraction.E04HotelReservation;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        runHoliday();
    }
    private static void runHoliday() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] tokens = input.split("\\s+");

        PriceCalculator calculator = new PriceCalculator(
                Double.parseDouble(tokens[0]),
                Integer.parseInt(tokens[1]),
                Season.valueOf(tokens[2].toUpperCase()),
                tokens[3].equals("SecondVisit") ? DiscountType.SECOND_VISIT
                : DiscountType.valueOf(tokens[3].toUpperCase()));

        System.out.printf("%.2f%n", calculator.calculate());
    }
}
