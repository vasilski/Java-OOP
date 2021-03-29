package A01WorkingWithAbstraction.E04HotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplayer;

    Season(int multiplayer) {
        this.multiplayer = multiplayer;
    }

    public int getMultiplayer() {
        return multiplayer;
    }
}
