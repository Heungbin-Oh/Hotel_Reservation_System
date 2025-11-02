package hotel.reservation.models;

import java.util.Date;
import hotel.reservation.enums.PaymentMethod;

public class Payment {
    private int id;
    private Billing billing;
    private PaymentMethod method;
    private double amount;
    private Date createdAt;

    // Getters and Setters
}
