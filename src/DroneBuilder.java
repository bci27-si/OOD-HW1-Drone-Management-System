///
/// Abstract Class Drone Contains 3 methods
/// abstract Battery capacity and FlightRange
/// Special features is concrete.
///
/// Design Theory:
/// every drone NEEDS to have battery to function, and for program purpose Flight range as well.
///
/// special features is not required but could be expected so its concrete.

// might needto change this to be a


public abstract class DroneBuilder implements DroneInterface{

    public abstract void BatteryCapacity();

    public abstract void FlightRange();
    // normally thei would be based on battery and weight, but not applicable here

    public void SpecialFeatures(){

        System.out.println("Special Features");
    }
}

/*

 */
