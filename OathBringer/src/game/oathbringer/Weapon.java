package game.oathbringer;

public class Weapon {
	private String name;
	private double damageFactor;
	private String desc;
	private int range;
	
	public Weapon(String name, double damageFactor, String desc, int range) {
		this.name = name;
		this.damageFactor = damageFactor;
		this.desc =  desc;
		this.range = range;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamageFactor() {
		return damageFactor;
	}

	public void setDamageFactor(double damageFactor) {
		this.damageFactor = damageFactor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	@Override
	public String toString() {
		return name + "\nDamage Factor: " + damageFactor;
	}
}
