module hotel.reservation.sys {
    requires javafx.controls;
    requires javafx.fxml;


    opens hotel.reservation.sys to javafx.fxml;
    exports hotel.reservation.sys;
}