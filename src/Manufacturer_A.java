public class Manufacturer_A implements Manufacturer {

    Surveilence_Drone sur = new Surveilence_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();

    // specific to manufactureer specs to be added HEREREREREERERERERERE

    // IRGHT HERE

    @Override
    public void makeSurveilenceDrone() {
        System.out.println("Making Surveilence Drone:" );
        sur.batteryCapacity(5000);
        sur.flightRange(20);
        sur.specialFeatures();

        // call all methods from that class here, create Manuf_A Version

    }

    @Override
    public void makeDeliveryDrone() {
        System.out.println("Make Delivery Drone" );
        System.out.println("Make Delivery Drone");
        d.batteryCapacity(10);
        d.flightRange(-5); // test negative. subtract from default amount
        d.specialFeatures();

    }

    @Override
    public void makeAgriculturalDrone() {
        System.out.println("Make Agricultural Drone");
        a.batteryCapacity(1000);
        a.flightRange(-10); // NEGATIVE HERE
        a.specialFeatures();
    }
}


