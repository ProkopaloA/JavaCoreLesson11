package ua.lviv.lgs;

public class Engine {
	private int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	@Override
	public String toString() {
		return "Engine [NumberOfCylinders= " + numberOfCylinders + "]";
	}
	

}
