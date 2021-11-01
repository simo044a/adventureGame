import java.util.ArrayList;

public class Enemy extends Player {

  private double enemyHealth;
  private double enemyDamage;
  private Room enemyCurrentRoom;

  public Enemy(String playerName, ArrayList<Item> inventory, ArrayList<Weapon> weaponEquipment, double health, boolean isPlayerAlive) {
    super(playerName, inventory, weaponEquipment, health, isPlayerAlive);
  }
}
