package Services;

public class DiningService implements Service{
    private final int cost = 50;
    private final String name = "Dining Service";

    // Method to return the cost of the dining service
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
