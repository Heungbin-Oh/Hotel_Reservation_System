package hotel.reservation.enums;

public enum Role {
    ADMIN("Admin"),
    MANAGER("Manager");

    private final String label;

    Role(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
