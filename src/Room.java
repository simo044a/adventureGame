import java.util.ArrayList;
public class Room {

  private String name; // Navnet på rummet
  private String roomDescription; // String der beskriver rummet til spilleren.
  private Item roomItem;
  private Room north;
  private Room south;
  private Room west;
  private Room east;
  private ArrayList<Item> roomContent;


  // Constructor til at tildele name til hvert rum ud fra setter.

  public Room(String name, String roomDescription) {
    setName(name);
    setRoomDescription(roomDescription);
  }

  public void setRoomContent(ArrayList<Item> roomContent) {this.roomContent = roomContent;}
  public ArrayList<Item> getRoomContent(){return roomContent;}

  public void addRoomContent(Item item){
    roomContent.add(item);
  }
  public void dropRoomContent(Item item){
    roomContent.remove(item);
  }

  // Set and Get for name
  public void setName(String name) {this.name = name;}
  public String getName() {return name;}

  // Set and Get for description
  public void setRoomDescription(String roomDescription) {this.roomDescription = roomDescription;}
  public String getRoomDescription() {return roomDescription;}

  public void setRoomItem(Item roomItem){this.roomItem = roomItem;}
  public Item getRoomItem(){return roomItem;}

  // Set and Get for north
  public void setNorth(Room north) {this.north = north;}
  public Room getNorth() {return north;}

  // Set and get for south
  public void setSouth(Room south) {this.south = south;}
  public Room getSouth() {return south;}

  // Set and get for west
  public void setWest(Room west) {this.west = west;}
  public Room getWest() {return west;}

  // Set and Get for east
  public void setEast(Room east) {this.east = east;}
  public Room getEast() {return east;}





  }
