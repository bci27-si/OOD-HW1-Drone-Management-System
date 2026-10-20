public class Delivery_Drone implements Drone {
    @Override
    public void batteryCapacity(int capacity) {
        int Generic_Capacity = 55_000 + capacity;
        System.out.println("Battery Capacity: 40,000mAh");

    }

    @Override
    public void flightRange(int range) {
        int Generic_Flight_Range = 65 + range;
        System.out.println("Flight Range: 65 Flight Hours");
    }

    // NOTE IN Surv DRONE
    @Override
    public void specialFeatures() {
        System.out.println("Payload Carrying Mechanism");
    }

}
