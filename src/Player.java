import java.util.ArrayList;

public class Player {
  private String name; // Attributes
  private ArrayList<Item> inventory; // -"-
  private Room currentRoom; // -"-
  private int Objects; // -"-

  public Player(String name, Room currentRoom, ArrayList<Item> inventory) { // Constructor
    this.setCurrentRoom(currentRoom);
    this.setName(name);
    this.setInventory(inventory);
  }

  public void take(Item item) {
    inventory.add(item);
  }

  public void drop(Item item) {
    inventory.remove(item);
  }

  public void setName(String name) {
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
}



