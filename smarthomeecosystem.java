abstract class device{
    private String brand;
    abstract void turnOn();
}
interface remotecontrollable{
    void connencttowifi();
}
interface powersaving{
    void getenergyrating();
}
class smartTV implements remotecontrollable, powersaving{
    private String model;
    public smartTV(String model){
        this.model = model;
    }
    @Override
    public void connencttowifi() {
        System.out.println("Connecting " + model + " to Wi-Fi...");
    }
    @Override
    public void getenergyrating() {
        System.out.println(model + " has an energy rating of A+");
    }
}
class electrickettle extends device{
    private String brand;
    public electrickettle(String brand){
        this.brand = brand;
    }
    @Override
    void turnOn() {
        System.out.println("Turning on the " + brand + " electric kettle...");
    }
}

class smarthomeecosystem {
    public static void main(String[] args) {
        smartTV myTV = new smartTV("Samsung QLED");
        electrickettle myKettle = new electrickettle("Philips");

        myTV.connencttowifi();
        myTV.getenergyrating();
        myKettle.turnOn();
    }
}