public class Delivery_Drone implements Drone {
    @Override
    public void batteryCapacity() {
        System.out.println("Battery Capacity: 40,000mAh");

    }

    @Override
    public void flightRange() {
        System.out.println("Flight Range: 65 Flight Hours");
    }

    @Override
    public void specialFeatures() {
        System.out.println("Payload Carrying Mechanism");
    }

}
