public class Manufacturer_A implements Manufacturer {

    Surveilence_Drone sur = new Surveilence_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();

    // specific to manufactureer specs to be added HEREREREREERERERERERE

    // IRGHT HERE

    @Override
    public void makeSurveilenceDrone() {
        System.out.println("===========================");
        System.out.println("Making Surveilence Drone:" );
        sur.batteryCapacity(5000);
        System.out.println("----");
        sur.flightRange(30);
        System.out.println("----");
        sur.specialFeatures();

        // call all methods from that class here, create Manuf_A Version

    }

    @Override
    public void makeDeliveryDrone() {
        System.out.println("===========================");
        System.out.println("Make Delivery Drone" );
        //System.out.println("Make Delivery Drone");
        d.batteryCapacity(100);
        System.out.println("----");
        d.flightRange(-5); // test negative. subtract from default amount
        System.out.println("----");
        d.specialFeatures();

    }

    @Override
    public void makeAgriculturalDrone() {

        System.out.println("===========================");
        System.out.println("Make Agricultural Drone");
        a.batteryCapacity(900);
        System.out.println("----");
        a.flightRange(-5); // NEGATIVE HERE
        System.out.println("----");
        a.specialFeatures();
        //\n - High Quality Camera.\n - Zoom 100x \n - infrared Night-Vision");
    }
}
