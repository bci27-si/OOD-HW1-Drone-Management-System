/// class Manufacturer_A contains three abstract methods,
///     makesurveilenceDrone(),
///     makeAgriculturaDronel(),
///     makeDevileryDrone()
/// this Manufacturer prioritizes Longer range
///
public class Manufacturer_A implements Manufacturer {

    Surveillance_Drone sur = new Surveillance_Drone();
    Agricultural_Drone a = new Agricultural_Drone();
    Delivery_Drone d = new Delivery_Drone();

    /// method overrides makeSurveilenceDrone()
    /// has battery capacity, flight range above default
    /// may have special features
    @Override
    public void makeSurveilenceDrone() {
        System.out.println("===========================");
        sur.batteryCapacity(5000);
        System.out.println("----");
        sur.flightRange(30);
        System.out.println("----");
        sur.specialFeatures();
        System.out.println();
        // call all methods from that class here, create Manuf_A Version
    }

    /// method overrides makeDeliveryDrone()
    /// has battery capacity: above default,
    /// flight range: below default
    /// may have special features
    @Override
    public void makeDeliveryDrone() {
        System.out.println("===========================");
        d.batteryCapacity(100);
        System.out.println("----");
        d.flightRange(-5); // test negative. subtract from default amount
        System.out.println("----");
        d.specialFeatures();
        System.out.println();
    }

    /// method overrides makeAgriculturalDrone()
    /// has battery capacity: above default,
    /// flight range: below defafult
    /// may have special features:
    @Override
    public void makeAgriculturalDrone() {

        System.out.println("===========================");
        a.batteryCapacity(900);
        System.out.println("----");
        a.flightRange(-5); // NEGATIVE HERE
        System.out.println("----");
        a.specialFeatures();
        System.out.println();
        //\n - High Quality Camera.\n - Zoom 100x \n - infrared Night-Vision");
    }
}
