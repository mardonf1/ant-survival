package model.actors;

public class Ant implements Actor, Runnable {

	private double health;
	
	public Ant() {
		health = 0;
	}
	
	@Override
	public void run() {
		
	}

	@Override
	public double getHealth() {
		return health;
	}

	@Override
	public void move() {
		
	}

	@Override
	public double attack() {
		return 0;
	}

	@Override
	public double defend() {
		return 0;
	}
}