package Rooms;

public class DeluxeRoom extends Room {

    // Defining the constructor
    public DeluxeRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    // Function that provides a description for the room
    @Override
    public String getDescription(){
        return "Deluxe Room";
    }

}
