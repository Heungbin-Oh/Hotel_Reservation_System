package hotel.reservation.models;

import java.util.Date;

public class AuditLog {
    private int id;
    private Date timestamp;
    private String actor;
    private String action;
    private String entityType;
    private int entityId;
    private String message;

    // Getters and Setters
}
