public class Room {

  private String name; // Navnet på rummet
  private String roomDescription; // String der beskriver rummet til spilleren.
  private Room north;
  private Room south;
  private Room west;
  private Room east;

  // Constructor til at tildele name til hvert rum ud fra setter.
  Room(String name) {setName(name);}


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



  /*
  Her er der blevet dannet nogle boolean værdier, som bruges til vores switch statement. Den checker om spillerens
  input playerDirection giver værdien "null", i forhold til det rum man er i, og hvilken retning man vælger.
  Hvis den returnere med "false", vil koden i switch springe over, udskrive til spilleren, at de ikke kan gå i den
  retning, og ført tilbage til starten af vores while-loop
   */

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

  String room1Description = room1Text();
  String room2Description = room2Text();
  String room3Description = room3Text();
  String room4Description = room4Text();
  String room5Description = room5Text();
  String room6Description = room6Text();
  String room7Description = room7Text();
  String room8Description = room8Text();
  String room9Description = room9Text();

  // tekst bokse room navne og beskrivelse
  public String room1Text() {
    return """
        You wake up in a van. You go outside to check your surroundings.
        You're at a road with trashed vehicle one way, the other way,
        full of mutated creatures in the distant. The road goes
        along a steep hill. Across the road, a big building.""";
  }

  public String room2Text() {
    return """
        This area has a thick fog. Looking around, you notice some destroyed
        and burned vehicles, and you can hear some kind of howls in the distance,
        but it doesn't sound like wolfs or dogs, but bigger and more human.
        The buildings in this area looks like they have been abandoned a long time ago.""";
  }

  public String room3Text() {
    return """
        The fog is fading a bit, the buildings here are destroyed.
        The sky is filled with birds, looks like crows but kinda big. Maybe ravens?
        There is only on way trough south, and that is a hole in the ground.
        It looks like the road has collapsed down in to a old metro.""";
  }

  public String room4Text() {
    return """     
        This area has broken and half burned shops and apartments. It was once filled with life
        but it's dead and silent now. It looks like there is trash along the road but when you look closer,
        you notice its only cloth, shoes and old suitcases looking like something from old soviet Russia.
        The area gives you the feeling of dread and people most have been in a rush.
        The shops a boarded shut and you are only able to keep walking the same path forward.""";
  }

  public String room5Text() {
    return """       
        The elevator goes all the way up to the roof without giving you a chanceto pick any floor.
        The elevator does open half way up, just enough for you to squeeze through.
        The helicopter looks out of place, since it looks all new with no scratches or anything.
        This is your way out of what ever this place is!""";
  }

  public String room6Text() {
    return """        
        As soon as you jump down from the edge of the road hanging down from the upper level, you land in water.
        It comes as a surprise because it was so still that it looked like dirt.
        It's not that deep but reach up to your knees.
        When you look up, you can see the birds through the hole, flying around, kinda fighting in the air.
        But when you look around, you notice how dark it's actually is when you are down here.
        The light from the hole you came from, shows that the metro is collapsed, making it only possible
        to take one path from here, in to darkness.""";
  }

  public String room7Text() {
    return """
        Dette sted kommer man fra north men kan kun gå videre øst.
        You come to a road block. There have been a lot of military here, blocking the road.
        The area have proof of combat. Bullet holes on the walls, the road have craters from grenades.
        The buildings in this area is destroyed and the only thing that looks like it haven't seen
        combat is the hospital in the distance, behind some of the roadblocks and military vehicles.""";
  }

  public String room8Text() {
    return """
        You are now standing inside of a hospital lounge. Around you is hospital beds, half emptied
        first-aid kits and an empty vending machine with broken glass. You can also see an elevator
        which seems to be working and over it you can see a sign stating that there is a
        helipad on the top floor of the building.""";
  }

  public String room9Text() {
    return """
        You are still surrounded by water up to your knees. A train stationed in front of you is lit up
        by an opening further ahead which looks like the way back up to the surface.""";
  }

}
