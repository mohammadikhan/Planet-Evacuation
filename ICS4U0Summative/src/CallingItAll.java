
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class CallingItAll {
	
	//generating list for least amount of trips required using an array list
		public static ArrayList<Planet> generateLotsOfDurantPlanets() {

			int durantPlanetsShowingUp = 3;

			ArrayList<Planet> durantPlanetArr = new ArrayList<Planet>();

			for (int i = 0; i < durantPlanetsShowingUp; i++) {

				durantPlanetArr.add(new Planet());

			}

			durantPlanetArr.sort(sortByTravels);

			return durantPlanetArr;
		}
	
	
	// Compares the times traveled between two planets
	public static Comparator<Planet> sortByTravels = new Comparator<Planet>() {

		
		public int compare(Planet durantPlanetOne, Planet durantPlanetTwo) {

			return durantPlanetOne.timesTraveled() - durantPlanetTwo.timesTraveled();
		}
	};

	// getting different planet names since all are called durant, distinction is needed
		public static int durantNameDifferentiator() {

			Random random = new Random();
			int durantNameDifferentiator = random.nextInt(3) + 1;

			return durantNameDifferentiator;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Possible Planets Kawhi Nation can go to safety at arch enemy Durant's Planets.");

		
		Route route = new Route("Planet Kawhi", null, 0, 0, null);
		
		
		Spaceship ship = new Spaceship();

		int yPoint = 0;
		int xPoint = 0;
		
		
		int timeLength = 0;
		int aliensRemaining = 0;
		int distanceLength = 0;

		String finalDurantPlanetArrival = null;

		for (Planet durantPlanet : generateLotsOfDurantPlanets()) {

			xPoint = durantPlanet.getXPoint();
			yPoint = durantPlanet.getYPoint();

			// finding distance from kawhi planet to durant planet
			distanceLength= (int) Math
					.sqrt(((durantPlanet.getXPoint() * durantPlanet.getXPoint()) + (durantPlanet.getYPoint() * durantPlanet.getYPoint())));

			timeLength = (int) (distanceLength / ship.getShipFastnessInSpace());

			// Generates planet name
			finalDurantPlanetArrival = "Planet" + durantNameDifferentiator();

			aliensRemaining = durantPlanet.victims();

			route = new Route("Planet Kawhi", finalDurantPlanetArrival, distanceLength, timeLength, null);

			while (aliensRemaining > 0) {

				for (Planet durantPlanetOne : generateLotsOfDurantPlanets()) {

					int newDistance = (int) Math.sqrt(((xPoint - durantPlanetOne.getXPoint()) * (xPoint - durantPlanetOne.getXPoint())
							+ (yPoint - durantPlanetOne.getYPoint()) * (yPoint - durantPlanetOne.getYPoint())));

					distanceLength = distanceLength+ newDistance;

					timeLength = (int) (distanceLength / ship.getShipFastnessInSpace());

					route = new Route("Planet Kawhi", finalDurantPlanetArrival, distanceLength, timeLength, "Planet Durant" + durantNameDifferentiator());

					aliensRemaining = aliensRemaining - durantPlanetOne.getAcceptingAliens();
					
					route.displayingTravellingRouteInfo(aliensRemaining);
					durantPlanetOne.displayingPlanetInfo(aliensRemaining);


				}

			}

			// displaying all such results

			route.displayingTravellingRouteInfo(aliensRemaining);
			durantPlanet.displayingPlanetInfo(aliensRemaining);
			
			

		}

	}

}
