package A02WorkingWithAbstractionEX.E03CardsWithPower;

public class Card {
    private String type;
    private String suit;

    public Card(String type, String suit) {
        this.type = type;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", type, suit, getPower());
    }

    private int getPower() {
        return RankPower.valueOf(type).getPower() + SuitPower.valueOf(suit).getPower();
    }
}
