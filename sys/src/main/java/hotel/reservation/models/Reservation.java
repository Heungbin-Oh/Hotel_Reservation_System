package hotel.reservation.models;

import java.util.Date;
import hotel.reservation.enums.ReservationStatus;

public class Reservation {
    private int id;
    private Date checkIn;
    private Date checkOut;
    private int numAdults;
    private int numChildren;
    private ReservationStatus status;
    private Guest guest;

    // Getters and Setters
}
