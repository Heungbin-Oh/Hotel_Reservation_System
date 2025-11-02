package hotel.reservation.models;

import hotel.reservation.enums.RoomType;
import hotel.reservation.enums.RoomStatus;

public class RoomFactory {

    public static Room createRoom(int id, String roomNumber, RoomType type, int beds, double basePrice) {
        Room room = new Room();
        room.setId(id);
        room.setRoomNumber(roomNumber);
        room.setType(type);
        room.setBeds(beds);
        room.setBasePrice(basePrice);
        room.setStatus(RoomStatus.AVAILABLE);
        return room;
    }
}
