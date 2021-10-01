public class Room {

  private String name;
  private String roomDescription;

  private Room north; // (Jeg er stadig usikre på hvilke datatyper)
  private Room south;
  private Room west;
  private Room east;

  Room(String name, String roomDescription){
    setName(name);
    setRoomDescription(roomDescription);

    System.out.println("Velkommen til rummet");
  }



  public void setName(String name){
  this.name = name;
  }

  public String getName(){return name;}

public void setRoomDescription(String roomDescription){
    this.roomDescription = roomDescription;
}

public String getRoomDescription() {return roomDescription;}

  public String toString(){
    return name + " " + roomDescription;

  }


}
