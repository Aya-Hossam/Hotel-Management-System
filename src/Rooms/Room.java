package Rooms;

import Services.Service;

import java.util.ArrayList;
import java.util.List;

abstract public class Room {
    // Defining the attributes
    private String roomNumber;
    private int baseRate;
    private List<Service> services = new ArrayList<>();
    private boolean isBooked = false;

    // Defining the constructor
    public Room(String roomNumber, int baseRate) {
        this.roomNumber = roomNumber;
        this.baseRate = baseRate;
    }

    // Setters
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    // Getters
    public String getRoomNumber() {
        return roomNumber;
    }
    public int getBaseRate() {
        return baseRate;
    }
    public boolean getBookingStatus() {
        return isBooked;
    }
    public List<Service> getServices() {
        return services;
    }

    // Defining the methods

    // Function to add a service to the room
    public void addService(Service service) {
        services.add(service);
        System.out.println("Added " + service.getName() + " to " + getDescription() + " - Room " + getRoomNumber());
    }

    // Function to calculate the total cost of the room
    public double getTotalCost(){
        double serviceCost = 0;
        for(Service service : services){
            serviceCost += service.getCost();
        }
        return baseRate + serviceCost;
    }

    // Function to get a description of the room type
    abstract public String getDescription();




}
