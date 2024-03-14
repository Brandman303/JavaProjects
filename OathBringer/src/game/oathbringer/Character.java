package game.oathbringer;

import java.util.Random;

public class Character {
	private String name;
	private String desc;
	private int strength; //potential max damage
	private int accuracy; //how often do strikes land
	private int speed; // how often do dodges succeed.
	private double health;
	private Weapon weapon;
	private Random rand = new Random();
	//May add private List<Weapon> weapons; for multiple weapons
	
	public Character(String name, String desc, int strength,
			int accuracy, int speed, double health, Weapon weapon) {
		this.name = name;
		this.desc = desc;
		this.strength = strength;
		this.accuracy = accuracy;
		this.speed = speed;
		this.health = health;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Random getRand() {
		return rand;
	}

	public void setRand(Random rand) {
		this.rand = rand;
	}
	
	public boolean hitOrMiss() {
		double randomNum = rand.nextDouble();
		if (())
		return false;
	}
	public double doDamage() {
		double randomNum = rand.nextDouble();
		return randomNum * strength * weapon.getDamageFactor();
	}
	
	public void recordDamage(double damage) {
		health = health - damage;
		if (health < 0) {
			health = 0;
		}
	}
	
	public boolean isDead() {
		return health <= 0;
	}
	
	public String toString() {
		return "\nName: " + name + "\nWeapon: " + "\nHealth: " + health + "\nStrength: " + strength
				+ "\nAccuracy: " + accuracy + "\nSpeed: " + speed;
	}
}
