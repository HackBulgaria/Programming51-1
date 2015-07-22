package week7;

public interface Zombie {
  public int getTotalHealth();
  public int getCurrentHealth();
  public void hit(int damage);
  public boolean isDead();
}