import java.util.ArrayList;

public class Player {
  private String playerName; // Attributes
  private ArrayList<Item> inventory; // -"-
  private Room currentRoom; // -"-
  private int Objects; // -"-
  private double health;


  public Player(String playerName,ArrayList<Item> inventory) { // Constructor
    this.setPlayerName(playerName);
    this.setInventory(inventory);
  }

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


}
