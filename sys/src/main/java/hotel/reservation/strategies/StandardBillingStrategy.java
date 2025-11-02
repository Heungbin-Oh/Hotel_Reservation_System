package hotel.reservation.strategies;

public class StandardBillingStrategy implements BillingStrategy{
    @Override
    public double calculateTotal(double subtotal, double discount, double tax, double loyaltyPoints) {
        return 0;
    }
}
