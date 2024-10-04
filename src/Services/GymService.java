package Services;

public class GymService implements Service {
    private final int cost = 70;
    private final String name = "Gym Service";

    // Method to return the cost of the gym service
    @Override
    public int getCost(){
        return cost;
    }

    // Method to return the name of the service
    @Override
    public String getName() {
        return name;
    }
}
