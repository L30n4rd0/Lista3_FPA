/**
 * 
 */
package ufrpe.fpa.questao4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonardo
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Create Array of CarbonFootprint
		 * */
		List<CarbonFootprint> carbonFootprints = new ArrayList<>();
		
		/*
		 * Create Car-type objects
		 * */
		CarbonFootprint car1 = new Car(Car.FUEL_ALCOHOL, 1000f, 60);
		CarbonFootprint car2 = new Car(Car.FUEL_GASOLINE, 1400f, 50);
		CarbonFootprint car3 = new Car(Car.FUEL_DIESEL, 3000f, 100);
		
		/*
		 * Insert references to Array of CarbonFootprints
		 * */
		carbonFootprints.add(car1);
		carbonFootprints.add(car2);
		carbonFootprints.add(car3);
		
		/*
		 * Create Bicycle-type objects
		 * */
		CarbonFootprint bicycle1 = new Bicycle(30f, Bicycle.NORMAL_BICYCLE);
		CarbonFootprint bicycle2 = new Bicycle(40f, Bicycle.RACING_BICYCLE);
		
		/*
		 * Insert references to Array of CarbonFootprints
		 * */
		carbonFootprints.add(bicycle1);
		carbonFootprints.add(bicycle2);
		
		/*
		 * Create Building-type objects
		 * */
		CarbonFootprint building1 = new Building(100, 300, true, false);
		CarbonFootprint building2 = new Building(800, 1000, false, true);
		
		/*
		 * Insert references to Array of CarbonFootprints
		 * */
		carbonFootprints.add(building1);
		carbonFootprints.add(building2);
		
		/*
		 * Iterating Array
		 * */
		for (CarbonFootprint carbonFootprint : carbonFootprints)
			System.out.println("CarbonFootprint: " + carbonFootprint.getCarbonFootprint());

	}

}
