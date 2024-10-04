import Rooms.Room;
import Services.Service;

import java.util.HashMap;

public class Hotel {
    private HashMap<String, Room> rooms = new HashMap<>();


    // Function to add a new room
    public void addRoom(Room room){
        // Check if the room already exists in the hotel
        if (rooms.containsKey(room.getRoomNumber())) {
            System.out.println("Room already exists");
        }
        else{
            rooms.put(room.getRoomNumber(), room);
            System.out.println("Successfully added room " + room.getRoomNumber());
        }
    }

    // Function to retrieve a room based on the room number
    public Room getRoom(String roomNumber){
        if(rooms.containsKey(roomNumber)){
            return rooms.get(roomNumber);
        }
        else{
            System.out.println("Room " + roomNumber + " not found");
            return null;
        }
    }

    // Function to book a room and add a service to it
    public void bookRoom(String roomNumber, Service service){
        Room room = getRoom(roomNumber);

        // Check if the room exists
        if (room == null) {
            System.out.println("Room " + roomNumber + " not found");
        }
        else{
            if(room.getBookingStatus()){
                System.out.println("Room " + roomNumber + " is already booked");
            }
            else{
                // Adding a service to the room
                room.addService(service);
                room.setBooked(true);

                System.out.println("Successfully booked room " + room.getRoomNumber());
            }
        }
    }

    // Function to display the booking details for a room
    public void displayBookingDetails(String roomNumber){
        Room room = getRoom(roomNumber);

        if (room == null) {
            System.out.println("Room " + roomNumber + " not found");
        }
        else{
            System.out.println("Booking for " + room.getDescription() + " - Room " + room.getRoomNumber());
            System.out.println("Total Cost: $" + String.format("%.1f", room.getTotalCost()));
            System.out.println("The booking includes the following services:");
            for(Service service : room.getServices()){
                System.out.println(service.getName());
            }
            System.out.println();
        }
    }
}
