public class Surveilence_Drone implements Drone {


    @Override
    public void batteryCapacity(int capacity) {
        int Generic_Capacity = 55_000 + capacity;
        System.out.println("Battery Capacity: " + Generic_Capacity + "mAh");
    }

    @Override
    public void flightRange(int range) {
        int Generic_Flight_Range = 100 + range;
        System.out.println("Flight Range: " + Generic_Flight_Range + " Flight Hours");

    }

    // add this : int chooseFeatures then use some kind of preset chooser, user can pick zero for none,
    // user can pick a number cooresponding to a feature or combo
    // this reeks of builder pattern...
    @Override
    public void specialFeatures() {
        System.out.println("Special Feature: \n - High Quality Camera.\n - Zoom 100x \n - infrared Night-Vision");

    }
}
