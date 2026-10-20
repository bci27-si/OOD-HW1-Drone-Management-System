public class Manufacturer_B implements Manufacturer {

    // specific to manufactureer specs to be added HEREREREREERERERERERE


    Surveilence_Drone sur = new Surveilence_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();


    @Override
    public void makeSurveilenceDrone() {
        System.out.println("===========================");
        //int i = 5000;
        sur.batteryCapacity(7000);
        System.out.println("----");
        sur.flightRange(20);
        System.out.println("----");
        sur.specialFeatures();
        // FIX ME need to add features to choose from

        System.out.println("Make Surveilence Drone");

        // call all methods from that class here, create Manuf_b Version
    }

    @Override
    public void makeDeliveryDrone() {
        System.out.println("===========================");
        System.out.println("Make Delivery Drone");
        d.batteryCapacity(300);
        System.out.println("----");
        d.flightRange(-10); // test negative. subtract from default amount
        System.out.println("----");
        d.specialFeatures();
        
    }

    @Override
    public void makeAgriculturalDrone() {
        System.out.println("===========================");
        System.out.println("Make Agricultural Drone");
        a.batteryCapacity(1200);
        System.out.println("----");
        a.flightRange(-15); // NEGATIVE HERE
        System.out.println("----");
        a.specialFeatures();

    }
}
