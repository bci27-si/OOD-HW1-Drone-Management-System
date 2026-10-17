public class Agricultural_Drone implements Drone{

    // modify methods to take into acount that its builder now


    @Override
    public void batteryCapacity() {
        System.out.println("Battery Capacity:  25,000 mAh");
    }

    @Override
    public void flightRange() {

        System.out.println("Flight Range: ");

    }

    @Override
    public void specialFeatures() {
        System.out.println("Special Features: \n Bug killer laser" );
    }


}
