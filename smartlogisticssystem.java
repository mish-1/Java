abstract class Transport{
    private String trackingId;
    public String destination;
    public Transport(String trackingId, String destination){
        this.trackingId = trackingId;
        this.destination = destination;
    }
    abstract void dispatch();
}
interface GPS{
    void getCoordinates();
}
interface autonomous{
    void selfNavigate();
}
class drone extends Transport implements GPS, autonomous{
    private String model;
    public drone(String trackingId, String destination, String model){
        super(trackingId, destination);
        this.model = model;
    }
    @Override
    void dispatch() {
        System.out.println("Dispatching drone " + model + " to " + destination);
    }
    @Override
    public void getCoordinates() {
        System.out.println("Getting GPS coordinates for drone " + model);
    }
    @Override
    public void selfNavigate() {
        System.out.println("Drone " + model + " is navigating autonomously...");
    }
}
class smartlogisticssystem {
    public static void main(String[] args) {
        drone deliveryDrone = new drone("DRN123", "New York", "DJI Mavic");
        deliveryDrone.dispatch();
        deliveryDrone.getCoordinates();
        deliveryDrone.selfNavigate();
    }
}