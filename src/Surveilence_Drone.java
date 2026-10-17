public class Surveilence_Drone implements Drone {


    @Override
    public void batteryCapacity() {
        System.out.println("Battery Capacity: 55,000mAh");
    }

    @Override
    public void flightRange() {
        System.out.println("Flight Range: 100 Flight Hours");

    }

    @Override
    public void specialFeatures() {
        System.out.println("Special Feature: \n - High Quality Camera.\n - Zoom 100x \n - infrared Night-Vision");

    }
}
