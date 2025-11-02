package hotel.reservation.enums;

public enum PricingModel {
    PER_NIGHT("Per Night"),
    PER_RESERVATION("Per Reservation");

    private final String label;

    PricingModel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
