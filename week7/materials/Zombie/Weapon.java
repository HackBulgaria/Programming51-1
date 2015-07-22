package week7;

public abstract class Weapon {
	
	protected int damage;
	protected int durability;
	protected int maxDurability;
	
	public Weapon(int damage, int durability) {
		this.damage = damage;
		this.durability = durability;
		this.maxDurability = durability;
	}
	
	public int getDamage() {
		return damage;
	}

	public int getDurability() {
		return durability;
	}
	
	public abstract int hit();
	
	public abstract String getType();
}
