import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Manufacturer_A a = new Manufacturer_A();
        Manufacturer_B b = new Manufacturer_B();


        // use scnr.close()

        int counter = 0;

        while (true) {
            System.out.println("      Select a manufacturer: \n--- Manufacturer A \n--- Manufacturer B");
            String choose = scnr.nextLine();
            System.out.println("Manufacturer " + choose.toUpperCase() + " Chosen");
            // used to upper so i matches nicely
            // prep for basic options etc
            System.out.println("Building Drones by Manufacturer " + choose.toUpperCase() + "\n");
            if(choose.equalsIgnoreCase("A")) {
                System.out.println("Making Surveilence Drone");
                a.makeSurveilenceDrone();

                System.out.println("Making Agricultural Drone");
                a.makeAgriculturalDrone();

                System.out.println("Making Delivery Drone");
                a.makeDeliveryDrone();
            }
            else if(choose.equalsIgnoreCase("B")) {
                System.out.println("Making Surveilence Drone");
                b.makeSurveilenceDrone();

                System.out.println("Making Agricultural Drone");
                b.makeAgriculturalDrone();

                System.out.println("Making Delivery Drone");
                b.makeDeliveryDrone();
            }
            else{
                System.out.println("Invalid choice.");
                // ends up being 5, but idk
                if(counter > 3){
                    System.out.println(" 5 Invalid choices");

                    break;
                }
                counter+=1;
            }

            /*
            System.out.println("Surveillance Drone");// if statements for scanner, but scanner not used
            if (choose.equalsIgnoreCase("A")) {
                a.makeSurveilenceDrone();

            } else if (choose.equalsIgnoreCase("B")) {
                b.makeSurveilenceDrone();
            }

            System.out.println("Delivery Drone");
            if (choose.equalsIgnoreCase("A")) {// use ignore case preventing read errors for lowerase letter ?
                a.makeDeliveryDrone();
            }
            else if (choose.equalsIgnoreCase("B")) {
                b.makeSurveilenceDrone();
            }
            else {
                System.out.println("Invalid Input");
            }

            System.out.println("Agricultural Drone");
            if (choose.equalsIgnoreCase("A")) {
                a.makeAgriculturalDrone();

            } else if (choose.equalsIgnoreCase("B")) {
                b.makeSurveilenceDrone();
            } else {
                System.out.println("Invalid Input");
            }
            //if (droneType.equals("1")) {}

            System.out.println(" FInished ? Change manufacturer? Restart? '- Done -' \n ' - Change - ' \n ' - Restart - ' ");

            String end = scnr.nextLine();

            if (end.equalsIgnoreCase("Done")) {
                System.out.println("Order Complete");
                break;
            }

            else if (end.equalsIgnoreCase("Change")) {
                System.out.println("Changing Manufacturer...");
                //choose.
            }
            else {
                System.out.println("SOmething brok");
            }*/
        }
    }
}

/*
Patterns:
Factory - Produces Manufacturers, but with different specifications.
Abstract factory - Produces drones with manufacturer specs
_________________
 */

/*
Problem 2 : Drone Management System
Overview:
You have been hired to develop a drone management system for a company that produces various types of drones for different purposes.
The company works with multiple manufacturers, and each manufacturer produces different types of drones with specific capabilities.
Your task is to create a flexible and extensible system that can handle different drone types
(e.g., Surveillance Drones, Delivery Drones, Agricultural Drones) produced by different manufacturers,
ensuring that the system can be easily expanded in the future.

Requirements:
Drone Types: Xompany produces several types of drones:
Surveillance Drones:
    - Used for monitoring and reconnaissance, equipped with high-quality cameras.
Delivery Drones:
    - Designed to carry packages over short distances, equipped with payload-carrying mechanisms.
Agricultural Drones:
    - Used for crop monitoring, irrigation, and pesticide spraying.


Each has certain characteristics such as:
Battery Capacity:
    - The maximum battery life in mAh.
Flight Range:
    - The distance the drone can cover in kilometers.
Special Features:
    - A distinguishing feature of the drone
    (i.e camera quality or payload capacity or product being delivered).

Manufacturers: Different manufacturers produce these drone types, but with varying specifications.
For example:
Manufacturer A may focus on drones with longer flight ranges.
Manufacturer B may prioritize drones with higher battery capacities.
Your system should account for these differences in drone specifications depending on the manufacturer.
System Functionality:
The system should allow users to
    - select a manufacturer.,
    - create different drone types (Surveillance, Delivery, Agricultural)
            for the selected manufacturer.

The system should display the specifications of the created drones,
    - battery capacity,
    - flight range, and
    - any special features.

Extensibility: The company may add new drone types or manufacturers in the future, so your system should be designed to easily accommodate such changes without significant modifications.

Instructions:
Drone Representation: Design a system to represent the different drone types and their unique characteristics.
Your design should ensure that each drone type can have different values for battery capacity, flight range, and special features (described above) depending on the manufacturer.
Manufacturer Representation: Your system should support the creation of drones by different manufacturers. Each manufacturer may have different specifications for the same drone type, so the system should reflect these variations. For this problem assume there are 2 ManufacturerA and ManufacturerB
Drone Creation: The drone creation process should be centralized so that new drone types or new manufacturers can be added with minimal changes to the existing codebase.
Output: The system should allow users to create drones of different types and manufacturers, and display their specifications. For example:
Surveillance Drone by ManufacturerA Battery: 4000 mAh, Range: 50 km, Special Feature: High-quality camera
Delivery Drone by ManufacturerB: Battery: 5000 mAh, Range: 40 km, Special Feature: High payload capacity
Requirement: Think about how your system can be designed in a way that promotes flexibility and scalability.
Submission Requirements:
Provide the full source code for your implementation, including a test case
Include a short explanation of your design choices and how your system can be easily extended to support new drone types or manufacturers.
If I want to extend the program by adding RescueDrones and ManufacturerC as new elements, how would they be integrated into your codebase? What design features make the codebase easier to extend?
UML Diagrams:
Create UML diagrams that represent your system's design. These diagrams should illustrate the relationships between classes and how the design patterns are applied in your implementation.

 */



