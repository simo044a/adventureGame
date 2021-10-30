import java.util.ArrayList;

public class Player {
  private String playerName; // Attributes
  private ArrayList<Item> inventory; // -"-
  private Room currentRoom; // -"-
  private double playerHealth;
  private ArrayList<Weapon> weaponEquipment;
  private Weapon currentWeapon;

   public Player(String playerName,ArrayList<Item> inventory, double health) { // Constructor
    this.setPlayerName(playerName);
    this.setInventory(inventory);
    this.setPlayerHealth(health);
  }
  
  

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
