package Rooms;

public class StandardRoom extends Room {

    // Defining the constructor
    public StandardRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    // Function that provides a description for the room
    @Override
    public String getDescription(){
        return "Standard Room";
    }

}
