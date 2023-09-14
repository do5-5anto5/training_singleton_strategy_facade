package quinto_gof.strategy;

public class Robo {

	private Behavior behavior; //here is the strategy
	
	public void setBehavior (Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		behavior.move();
	}
}
