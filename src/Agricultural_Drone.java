public class Agricultural_Drone implements Drone{

    // modify methods to take into acount that its builder now


    @Override
    public void batteryCapacity(int capacity) {
        int Generic_Capacity = 55_000 + capacity;
        System.out.println("Battery Capacity:  25,000 mAh");
    }

    @Override
    public void flightRange(int range) {
        int Generic_Flight_Range = 100 +  range;
        System.out.println("Flight Range: ");

    }
    // NOTE IN Surv DRONE
    @Override
    public void specialFeatures() {
        System.out.println("Special Features: \n Bug killer laser" );
    }


}
