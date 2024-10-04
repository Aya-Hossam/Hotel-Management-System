package Rooms;

public class SuiteRoom extends Room {

    // Defining the constructor
    public SuiteRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    // Function that provides a description for the room
    @Override
    public String getDescription(){
        return "Suite Room";
    }

}
