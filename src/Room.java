public class Room {

  private String name;
  private String roomDescription;

  private Room north; // (Jeg er stadig usikre på hvilke datatyper der skal bruges)
  private Room south;
  private Room west;
  private Room east;

  // Constructor til forsøg
  Room(String name, String roomDescription) {
    setName(name);
    setRoomDescription(roomDescription);
  }


  // Set and Get for name
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  // Set and Get for name
  public void setRoomDescription(String roomDescription) {
    this.roomDescription = roomDescription;
  }

  public String getRoomDescription() {
    return roomDescription;
  }

  // Set and Get for north
  public void setNorth(Room north) {
    this.north = north;
  }

  public Room getNorth() {
    return north;
  }

  // Set and get for south
  public void setSouth(Room south) {
    this.south = south;
  }

  public Room getSouth() {
    return south;
  }

  // Set and get for west
  public void setWest(Room west) {
    this.west = west;
  }

  public Room getWest() {
    return west;
  }

  // Set and Get for east
  public void setEast(Room east) {
    this.east = east;
  }

  public Room getEast() {
    return east;
  }


  public String toString() {
    return name + " " + roomDescription;

  }

  boolean checkNorth(){
    if (this.north==null){
      return false;}
    else{
      return true;}
  }

  boolean checkSouth(){
    if (this.south==null){
      return false;}
    else{
      return true;}
  }

  boolean checkWest(){
    if (this.west==null){
      return false;}
    else{
      return true;}
  }

  boolean checkEast(){
    if (this.east==null){
      return false;}
    else{
      return true;}
  }

}


