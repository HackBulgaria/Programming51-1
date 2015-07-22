package week7;

public class CasualZombie implements Zombie {

	private int health;
	
	public CasualZombie(int health) {
		this.health = health;
	}
	
	
	public int getTotalHealth() {
		return health;
	}

	public int getCurrentHealth() {
		return health;
	}

	public void hit(int damage) {
		health -= damage;
		if(health <= 0) {
			health = 0;
		}
	}

	public boolean isDead() {
		return health == 0;
	}
	
}
