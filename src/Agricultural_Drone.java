/// Class Agricultural_Drone uses drone interface
/// creates default values for each component of the drone
public class Agricultural_Drone implements Drone{

    // modify methods to take into acount that its builder now


    @Override
    public void batteryCapacity(int capacity) {
        int Generic_Capacity = 55_001 + capacity;
        System.out.println("Battery Capacity: " +  Generic_Capacity);
    }// added 1 to make sure everything adds properly

    @Override
    public void flightRange(int range) {
        int Generic_Flight_Range = 100 +  range;
        System.out.println("Flight Range: " +  Generic_Flight_Range);

    }
    // NOTE IN Surv DRONE
    @Override
    public void specialFeatures() {
        System.out.println("Special Features: \n Bug killer laser" );
    }


}
