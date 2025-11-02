package hotel.reservation.strategies;

public interface BillingStrategy {
    double calculateTotal(double subtotal, double discount, double tax, double loyaltyPoints);
}