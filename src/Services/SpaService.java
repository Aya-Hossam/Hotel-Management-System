package Services;

public class SpaService implements Service{
    private final int cost = 100;
    private final String name = "Spa Service";

    // Method to return the cost of the spa service
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
