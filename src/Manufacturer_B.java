public class Manufacturer_B implements Manufacturer {

    // specific to manufactureer specs to be added HEREREREREERERERERERE


    Surveilence_Drone sur = new Surveilence_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();


    @Override
    public void makeSurveilenceDrone() {
        //int i = 5000;
        sur.batteryCapacity(5000);
        sur.flightRange(20);
        sur.specialFeatures();
        // FIX ME need to add features to choose from

        System.out.println("Make Surveilence Drone");

        // call all methods from that class here, create Manuf_b Version
    }

    @Override
    public void makeDeliveryDrone() {
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
