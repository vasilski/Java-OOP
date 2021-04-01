package A02WorkingWithAbstractionEX.E02CardRank;

public class Main {
    public static void main(String[] args) {

        CardRank[] cardRank = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank suit : cardRank) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(), suit);
        }
    }
}
