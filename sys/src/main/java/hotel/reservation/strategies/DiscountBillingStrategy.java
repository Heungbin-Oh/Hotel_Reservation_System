package hotel.reservation.strategies;

public class DiscountBillingStrategy implements BillingStrategy{
    @Override
    public double calculateTotal(double subtotal, double discount, double tax, double loyaltyPoints) {
        return 0;
    }
}
