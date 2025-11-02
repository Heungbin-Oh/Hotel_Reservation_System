package hotel.reservation.models;

import java.util.Date;
import hotel.reservation.enums.RoomType;

public class Waitlist {
    private int id;
    private Guest guest;
    private RoomType requestedType;
    private Date dateRangeStart;
    private Date dateRangeEnd;
    private String status;

    // Getters and Setters
}
