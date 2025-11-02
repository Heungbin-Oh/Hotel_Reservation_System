package hotel.reservation.enums;

public enum RoomType {
    SINGLE("Single"),
    DOUBLE("Double"),
    DELUXE("Deluxe"),
    PENTHOUSE("Penthouse");

    private final String label;

    RoomType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
