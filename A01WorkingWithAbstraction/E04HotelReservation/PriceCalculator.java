package A01WorkingWithAbstraction.E04HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private DiscountType discountType;
    private Season season;

    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculate() {
        return pricePerDay * days * season.getMultiplayer() * (1 - (discountType.getPercentage() /100.00));
    }

}
