
import java.util.Random;

public class Planet extends Spaceship {
	
	

	public Planet() {

	}

	//finds remaining population left

	public int victims() {
		
		kawhiPop = getKawhiPop() - getCurrentPlanetPopulation();
		
		if (kawhiPop < 0) {
			kawhiPop = 0;
		}
		
		setKawhiPop(kawhiPop);
		
		return kawhiPop;
	}
	
	
	// number of trips needed
	
	public int timesTraveled() {
		int acceptingPlanetPop = getAcceptingAliens();
		int maxAliens = getMaxiumAlienPlanetPopulation();
		int trips = 0;

		while (acceptingPlanetPop > 0) {

			if (acceptingPlanetPop > maxAliens) {
				
				acceptingPlanetPop -= maxAliens;
				
				
			} else {
				
				
				maxAliens = acceptingPlanetPop;
				acceptingPlanetPop -= maxAliens;
			}

			trips++;
		}

		return trips;
	}

	// getting x value for the coordinate
	Random random = new Random();
	
	
	int xPointPart = random.nextInt(50 + 1 + 50) - 50;

	
	public int getXPoint() {
		
		return xPointPart;
	}

	
	public void settingXPart(int xPointPart) {
		
		this.xPointPart = xPointPart;
	}

	//getting y value for the coordinate
	int yPointPart = random.nextInt(50 + 1 + 50) - 50;

	
	public int getYPoint() {
		
		return yPointPart;
	}

	
	public void settingYPart(int yPointPart) {
		
		this.yPointPart = yPointPart;
	}

	//showing the planet population
	int currentPopulationPlanet = random.nextInt(999999999 + 1 - 100000) - 100000;

	
	public int getCurrentPlanetPopulation() {
		
		return currentPopulationPlanet;
	}

	
	public void setCurrentPlanetPopulation(int currentPopulationPlanet) {
		
		this.currentPopulationPlanet = currentPopulationPlanet;
	}

	// maximum population 
	int maxAlienPlanetPopulation = 1000000000;

	
	public int getMaxiumAlienPlanetPopulation() {
		
		return maxAlienPlanetPopulation;
	}

	public void setMaxPlanetPop(int maxAlienPlanetPopulation) {
		
		this.maxAlienPlanetPopulation = maxAlienPlanetPopulation;
	}

	// capacity of aliens allowed
	int allowedAliens = (getMaxiumAlienPlanetPopulation() - getCurrentPlanetPopulation());

	
	public int getAcceptingAliens() {
		
		return allowedAliens;
	}

	
	public void setAllowedAliens(int allowedAliens) {
		this.allowedAliens = allowedAliens;
	}

	// planet kawhi and its population
	private int kawhiPop = (int) 1000000000; 

	public int getKawhiPop() {
		return kawhiPop;
	}

	public void setKawhiPop(int kawhiPop) {
		this.kawhiPop = kawhiPop;
	}
	
	//prints planet information
	 
		public void displayingPlanetInfo(int remainingAliens) {
			
			if (remainingAliens < 0) {
				remainingAliens = 0;
			}
			
			System.out.println("Finding Point Location At: " + "(" + getXPoint() + "," + getYPoint() + ")");
			System.out.println("Current Alien Population oF Planet Kawhi: " + getCurrentPlanetPopulation());
			System.out.println("Back and Forth Scenarios: " + timesTraveled());
			System.out.println("Maximum Number Of Aliens Allowed: " + getAcceptingAliens());
			System.out.println("Victims: " + victims());
		}
}