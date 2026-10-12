public class Delivery_Drone_Factory extends Drone_Factory {
    @Override
    public void BatteryCapacity() {

        System.out.println("Battery Capacity: 40,000mAh");

    }

    @Override
    public void FlightRange() {
        System.out.println("Flight Range: 65 Flight Hours");

    }

    @Override
    public void SpecialFeatures() {
        super.SpecialFeatures();
        System.out.println("Payload Carrying Mechanism");
    }

}
