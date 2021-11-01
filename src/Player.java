import java.util.ArrayList;

public class Player {
  private String playerName; // Attributes
  private ArrayList<Item> inventory; // -"-
  private Room currentRoom; // -"-
  private double playerHealth;
  private ArrayList<Weapon> weaponEquipment;
  private Weapon currentWeapon;
  private boolean isPlayerAlive;

   public Player(String playerName,ArrayList<Item> inventory, ArrayList<Weapon> weaponEquipment, double health, boolean isPlayerAlive) { // Constructor
    this.setPlayerName(playerName);
    this.setInventory(inventory);
    this.setWeaponEquipment(weaponEquipment);
    this.setPlayerHealth(health);
    this.setIsPlayerAlive(isPlayerAlive);
  }

  public void setIsPlayerAlive(boolean isPlayerAlive){this.isPlayerAlive = isPlayerAlive;}
  public boolean getIsPlayerAlive(){return isPlayerAlive;}

  public void setPlayerHealth(double playerHealth){this.playerHealth = playerHealth;}
  public double getPlayerHealth(){return playerHealth;}

  public void takeItem(Item item) {
    inventory.add(item);
  }
  public void dropItem(Item item) {
    inventory.remove(item);
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setInventory(ArrayList<Item> inventory) {
    this.inventory = inventory;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setWeaponEquipment(ArrayList<Weapon> weaponEquipment){
     this.weaponEquipment = weaponEquipment;
  }

  public ArrayList<Weapon> getWeaponEquipment(){
     return getWeaponEquipment();
  }

  public void setCurrenWeapon(Weapon currentWeapon){
     this.currentWeapon = currentWeapon;
  }

  public Weapon getCurrentWeapon(){
     return currentWeapon;
  }



}
