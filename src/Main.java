import Rooms.*;
import Services.*;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addRoom(new StandardRoom("101", 200));   // Create Standard Room
        hotel.addRoom(new DeluxeRoom("102", 300));     // Create Deluxe Room
        hotel.addRoom(new SuiteRoom("103", 500));      // Create Suite Room

        System.out.println();

        hotel.bookRoom("101", new SpaService());       // Add Spa service to Standard Room
        hotel.bookRoom("102", new DiningService());    // Add Dining service to Deluxe Room
        hotel.bookRoom("103", new GymService());       // Add Gym service to Suite Room

        System.out.println();

        hotel.displayBookingDetails("101");
        hotel.displayBookingDetails("102");
        hotel.displayBookingDetails("103");

        System.out.println();

        // Trying to book an already booked room
        hotel.bookRoom("101", new GymService());

        System.out.println();

        // Adding more services to a room
        Room room = hotel.getRoom("101");
        room.addService(new DiningService());
        hotel.displayBookingDetails("101");

    }
}