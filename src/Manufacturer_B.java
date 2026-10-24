/// class Manufacturer_A contains three abstract methods,
///     makesurveilenceDrone(),
///     makeAgriculturaDronel(),
///     makeDevileryDrone()
/// this Manufacturer prioritizes Higher Battery Capacity
///
public class Manufacturer_B implements Manufacturer {

    Surveillance_Drone sur = new Surveillance_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();


    @Override
    public void makeSurveilenceDrone() {
        System.out.println("===========================");
        sur.batteryCapacity(7000);
        System.out.println("----");
        sur.flightRange(20);
        System.out.println("----");
        sur.specialFeatures();
        System.out.println();

        // call all methods from that class here, create Manuf_b Version
    }

    @Override
    public void makeDeliveryDrone() {
        System.out.println("===========================");
        d.batteryCapacity(600);
        System.out.println("----");
        d.flightRange(-10); // test negative. subtract from default amount
        System.out.println("----");
        d.specialFeatures();
        System.out.println();
        
    }
    /// method overrides makeAgriculturalDrone()
    /// has battery capacity, flight range below default
    /// may have special features
    @Override
    public void makeAgriculturalDrone() {
        System.out.println("===========================");
        //System.out.println("Make Agricultural Drone");
        a.batteryCapacity(1200);
        System.out.println("----");
        a.flightRange(-15); // NEGATIVE HERE
        System.out.println("----");
        a.specialFeatures();
        System.out.println();

    }
}

