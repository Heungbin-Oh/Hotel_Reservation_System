package hotel.reservation.enums;

public enum PaymentMethod {
    CASH("Cash"),
    CARD("Card"),
    POINTS("Points");

    private final String label;

    PaymentMethod(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
