public class Surveilence_Drone_Factory extends Drone_Factory {


    @Override
    public void BatteryCapacity() {
        System.out.println("Battery Capacity: 55,000mAh");
    }

    @Override
    public void FlightRange() {
        System.out.println("Flight Range: 100 Flight Hours");

    }

    @Override
    public void SpecialFeatures() {
        super.SpecialFeatures();
        System.out.println("Special Feature: \n - High Quality Camera.\n - Zoom 100x \n - infrared Night-Vision");

    }
}
