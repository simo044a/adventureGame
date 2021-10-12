import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    // Alle variabler i Adventure klassen.

    Scanner in = new Scanner(System.in);
    boolean isGameActive = true; // boolean værdi til while-loop, for at køre spillet, indtil der gives et exit input.
    String playerDirection; // String input til spilleren, som bliver checket i switch og if-loop.
    Room currentRoom;

    Room room1 = new Room("\nArea 1", """
        You're at a road with trashed vehicle one way, the other way is
        full of mutated creatures in the distant. The road goes
        along a steep hill. Across the road, a big building.""");

    Room room2 = new Room("\nArea 2", """
        This area has a thick fog. Looking around, you notice some destroyed
        and burned vehicles, and you can hear some kind of howls in the distance,
        but it doesn't sound like wolfs or dogs, but bigger and more human.
        The buildings in this area looks like they have been abandoned a long time ago.""");

    Room room3 = new Room("\nArea 3", """
        The fog is fading a bit, the buildings here are destroyed.
        The sky is filled with birds, looks like crows but kinda big. Maybe ravens?
        There is only on way trough south, and that is a hole in the ground.
        It looks like the road has collapsed down in to a old metro.""");

    Room room4 = new Room("\nArea 4", """
        This area has broken and half burned shops and apartments. It was once filled with life
        but it's dead and silent now. It looks like there is trash along the road but when you look closer,
        you notice its only cloth, shoes and old suitcases looking like something from old soviet Russia.
        The area gives you the feeling of dread and people most have been in a rush.
        The shops a boarded shut and you are only able to keep walking the same path forward.""");

    Room room5 = new Room("\nArea 5", """
        The elevator goes all the way up to the roof without giving you a chanceto pick any floor.
        The elevator does open half way up, just enough for you to squeeze through.
        The helicopter looks out of place, since it looks all new with no scratches or anything.
        This is your way out of what ever this place is!""");

    Room room6 = new Room("\nArea 6", """
        As soon as you jump down from the edge of the road hanging down from the upper level, you land in water.
        It comes as a surprise because it was so still that it looked like dirt.
        It's not that deep but reach up to your knees.
        When you look up, you can see the birds through the hole, flying around, kinda fighting in the air.
        But when you look around, you notice how dark it's actually is when you are down here.
        The light from the hole you came from, shows that the metro is collapsed, making it only possible
        to take one path from here, in to darkness.""");

    Room room7 = new Room("\nArea 7", """
        You come to a road block. There have been a lot of military here, blocking the road.
        The area have proof of combat. Bullet holes on the walls, the road have craters from grenades.
        The buildings in this area is destroyed and the only thing that looks like it haven't seen
        combat is the hospital in the distance, behind some of the roadblocks and military vehicles.""");

    Room room8 = new Room("\nArea 8", """
        You are now standing inside of a hospital lounge. Around you is hospital beds, half emptied
        first-aid kits and an empty vending machine with broken glass. You can also see an elevator
        which seems to be working and over it you can see a sign stating that there is a
        helipad on the top floor of the building.""");

    Room room9 = new Room("\nArea 9", """
        You are still surrounded by water up to your knees. A train stationed in front of you is lit up
        by an opening further ahead which looks like the way back up to the surface.""");


    // Her bliver attributterne tildelt, for hvordan hvert rum ligger i forhold til hinandens retninger.

    room1.setSouth(room4);
    room1.setEast(room2);

    room2.setWest(room1);
    room2.setEast(room3);

    room3.setSouth(room6);
    room3.setWest(room2);

    room4.setNorth(room1);
    room4.setSouth(room7);

    room5.setSouth(room8);

    room6.setNorth(room3);
    room6.setSouth(room9);

    room7.setNorth(room4);
    room7.setEast(room8);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);

    room9.setNorth(room6);
    room9.setWest(room8);


    // Her gives en introduktion til spillet handling og input muligheder.
    System.out.println("""
         
        Welcome to the adventure game! The map consist of nine areas.
               
        Choose a direction to go: north, south, west and east.
               
        Other helpful commands: "look", for getting the name and description of the current room,
        or write "exit" to end the game.
         
        "You wake up in a van. You go outside to check your surroundings."
         """);

    currentRoom = room1;
    System.out.println("\n" + currentRoom.getRoomDescription());

    /*Her bliver spillets inputs del startet - koden kører i et loop ud fra boolean variablen "isGameActive"
    indtil spilleren giver input "go exit".*/
    while (isGameActive) {

      playerDirection = in.nextLine(); //Alt input fra spilleren sker her.


      /*I dette switch loop, tjekker input playerDirection om de giver et valid input. Alt efter hvilket rum spilleren
      befinder sig i, og hvilken retning de vælger, ændres variablen "currentRoom". Dernæst opdateres currenRoom til det
      nye rum, og udprinter navnet på rummet, samt en beskrivelse.*/

      switch (playerDirection) {
        case "go north", "north", "n":
          if (currentRoom.getNorth() != null) {
            currentRoom = currentRoom.getNorth();
            System.out.println("You are currently here: \n" + currentRoom.getName() + "\n" +
                "" + currentRoom.getRoomDescription());
          } else {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;

        case "go south", "south", "s":
          if (currentRoom.getSouth() != null) {
            currentRoom = currentRoom.getSouth();
            System.out.println("You are currently here: \n" + currentRoom.getName() + "\n" +
                "" + currentRoom.getRoomDescription());
          } else {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;

        case "go west", "west", "w":
          if (currentRoom.getWest() != null) {
            currentRoom = currentRoom.getWest();
            System.out.println("You are currently here: \n" + currentRoom.getName() + "\n" +
                "" + currentRoom.getRoomDescription());
          } else {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;

        case "go east", "east", "e":
          if (currentRoom.getEast() != null) {
            currentRoom = currentRoom.getEast();
            System.out.println("You are currently here: \n" + currentRoom.getName() + "\n" +
                "" + currentRoom.getRoomDescription());
          } else {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;

        case "look":
          System.out.println("You are currently here: " + currentRoom.getName() + """
              """ + currentRoom.getRoomDescription());
          break;

        case "help":
          System.out.println("""
              Choose a direction to go: north, south, west and east.
              Other commands: look, help or exit.""");
          break;

        case "exit":
          isGameActive = false;
          break;

        default:
          System.out.println("Sorry! Your input is invalid.. Try again!");
          break;
      }
    }
  }
}
