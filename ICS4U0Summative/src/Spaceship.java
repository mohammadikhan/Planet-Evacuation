
public class Spaceship {

	public Spaceship() {
		
	}

	//this is to get the max number of aliens
	
	public int getMaxAlienPlanetPopulation() {
		return maxAlienPlanetPopilation;
	}
		
	//setting the number of aliens on the spaceship at this point
	public void setCurrentAliens(int currentAliens) {
		this.currentAliens = currentAliens;
		}

	// displaying the current number of aliens on the spaceship
	private int currentAliens = 0;
	
	// displaying the maximum number of aliens allowed
		private int maxAlienPlanetPopilation = 10000000;
	
	// getting the distance in years
		private int shipFastnessInSpace = 2;

	// this is to get the current number of aliens on the spaceship
	
	public int getCurrentAliens() {
		return currentAliens;
	}

	//getting the speed to see how fast the ship is going 
	public int getShipFastnessInSpace() {
		return shipFastnessInSpace;
	}

}



	