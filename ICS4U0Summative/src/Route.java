import java.util.Random;

public class Route {

		
	// this is for the arriving planet
	String arrivingAlienPlanet;

	
	public String getArrivingAlienPlanet() {
		return arrivingAlienPlanet;
	}

 void setArrivingAlienPlanet(String neighbouringPlanet) {
		this.neighbouringPlanet = neighbouringPlanet;
	}
 
 	//This is for the originating Planet
	String startingAlienPlanet = "Planet Kawhi";

	
	public String getStartingAlienPlanet() {
		
		return startingAlienPlanet;
	}
	
	// getting the neihbouring planet if came across in journey to other planet
		String neighbouringPlanet;
		

		public String getNeighbouringPlanet() {
			return neighbouringPlanet;
		}


		public void setNeighbouringPlanet(String neighbouringPlanet) {
			this.neighbouringPlanet = neighbouringPlanet;
		}

	
	public void setStartingAlienPlanet(String startingAlienPlanet) {
		
		this.startingAlienPlanet = startingAlienPlanet;
	}
 
 	//getting the time length of the trip
	int timeLength;

	
	public int getTimeLength() {
		return timeLength;
	}
	
	
	public int setTimeLength(int timeLength) {
		return this.timeLength = timeLength;
	}


	// getting the length of the distance of the trip
	int distanceLength;
	
	
	public int getDistanceLength() {
		return distanceLength;
	}


	public void setDistanceLength(int distanceLength) {
		this.distanceLength = distanceLength;
	}
	
	public Route(String startingAlienPlanet, String arrivingAlienPlanet, int distanceLength, int timeLength, String neighbouringPlanet) {

		this.setStartingAlienPlanet(startingAlienPlanet);
		this.setNeighbouringPlanet(neighbouringPlanet);
		this.setDistanceLength(distanceLength);
		this.setTimeLength(timeLength);
		this.setArrivingAlienPlanet(arrivingAlienPlanet);
	}
	
	// prints the details about the three planets
	public void displayingTravellingRouteInfo(int victims) {
		if (victims == 0) {
			
			
			System.out.println("\nOriginatio From: " + getStartingAlienPlanet() + " \nArriving At: " + getArrivingAlienPlanet());
		}else {
			
			
			System.out.println("\nOriginating: " + getStartingAlienPlanet() + "\nPassing Neighbouring Durant Planet At: " + getNeighbouringPlanet() + "\nArriving At: " + getArrivingAlienPlanet());
		}
		
		System.out.println("Length of the distance: " + getDistanceLength() + " light years");
		
		System.out.println("Time length: " + getTimeLength() + " years");
	
		
		
}
	
}

	
