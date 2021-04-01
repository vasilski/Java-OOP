package A02WorkingWithAbstractionEX.E03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        String suit = scan.nextLine();

        Card card = new Card(type, suit);

        System.out.println(card.toString());
    }
}
