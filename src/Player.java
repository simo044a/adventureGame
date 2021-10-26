import java.util.ArrayList;

public class Player {
  private String name; // Attributes
  private ArrayList<Item> inventory; // -"-
  private Room currentRoom; // -"-
  private int Objects; // -"-
  private double health;

  public Player(String name, Room currentRoom, ArrayList<Item> inventory) { // Constructor
    this.setCurrentRoom(currentRoom);
    this.setPlayerName(name);
    this.setInventory(inventory);
  }

  public void takeItem(Item item) {
    inventory.add(item);
  }
  public void dropItem(Item item) {
    inventory.remove(item);
  }

  public void setPlayerName(String name) {
    this.name = name;
  }

  public void getName(String name) {
    this.name = name;
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

  public String toString(){
    return this.name + " " + this.inventory;
  }


}
