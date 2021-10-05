import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    // Alle variabler i Adventure klassen.
    Scanner in = new Scanner(System.in);
    boolean isGameActive = true; // boolean værdi til while-loop, for at køre spillet, indtil der gives et exit input.
    String playerDirection; // String input til spilleren, som bliver checket i switch og if-loop.
    Room currentRoom; /* variabel, som holder styr på hvilket rum spilleren befinder sig i, og ændres i switch statement
    via input. */

    Room room1 = new Room("\nArea 1");
    Room room2 = new Room("\nArea 2");
    Room room3 = new Room("\nArea 3");
    Room room4 = new Room("\nArea 4");
    Room room5 = new Room("\nArea 5");
    Room room6 = new Room("\nArea 6");
    Room room7 = new Room("\nArea 7");
    Room room8 = new Room("\nArea 8");
    Room room9 = new Room("\nArea 9");


    // Her bliver attributterne tildelt, for hvordan hvert rum ligger i forhold til hinandens retninger.
    currentRoom = room1;

    room1.setRoomDescription(room1.room1Description);
    room1.setNorth(null);
    room1.setSouth(room4);
    room1.setWest(null);
    room1.setEast(room2);

    room2.setRoomDescription(room2.room2Description);
    room2.setNorth(null);
    room2.setSouth(null);
    room2.setWest(room1);
    room2.setEast(room3);

    room3.setRoomDescription(room3.room3Description);
    room3.setNorth(null);
    room3.setSouth(room6);
    room3.setWest(room2);
    room3.setEast(null);

    room4.setRoomDescription(room4.room4Description);
    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setWest(null);
    room4.setEast(null);

    room5.setRoomDescription(room5.room5Description);
    room5.setNorth(null);
    room5.setSouth(room8);
    room5.setWest(null);
    room5.setEast(null);

    room6.setRoomDescription(room6.room6Description);
    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setWest(null);
    room6.setEast(null);

    room7.setRoomDescription(room7.room7Description);
    room7.setNorth(room4);
    room7.setSouth(null);
    room7.setWest(null);
    room7.setEast(room8);

    room8.setRoomDescription(room8.room8Description);
    room8.setNorth(room5);
    room8.setSouth(null);
    room8.setWest(room7);
    room8.setEast(room9);

    room9.setRoomDescription(room9.room9Description);
    room9.setNorth(room6);
    room9.setSouth(null);
    room9.setWest(room8);
    room9.setEast(null);




    // Her gives en introduktion til spillet handling og input muligheder.
    System.out.println("\nWelcome to the adventure game! \nThe map consist of nine areas.");
    System.out.println("\nChoose a direction to go: north, south, west and east.");
    System.out.println("\nOther helpful commands: \"look\", for getting the name and description of the current room, " +
        "\nor write \"exit\" to end the game.\n");
    System.out.println("You wake up in a van. You go outside to check your surroundings.");

    //System.out.println("You are currently here: " + currentRoom.getName());
    System.out.println("\n" + currentRoom.getRoomDescription());

    /*
    Her bliver spillets inputs del startet - koden kører i et loop ud fra boolean variablen "isGameActive"
    indtil spilleren giver input "go exit".
     */
    while (isGameActive) {

      playerDirection = in.nextLine(); //Alt input fra spilleren sker her.


      /*
      I dette switch loop, tjekker input playerDirection om de giver et valid input. Alt efter hvilket rum spilleren
      befinder sig i, og hvilken retning de vælger, ændres variablen "currentRoom". Dernæst opdateres currenRoom til det
      nye rum, og udprinter navnet på rummet, samt en beskrivelse.
       */

      switch (playerDirection) {
        case "go north", "north":
          if (currentRoom.checkNorth()) {
            currentRoom = currentRoom.getNorth();
            System.out.println("You are currently here " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkNorth()) {
            System.out.println("You cannot go in that direction. Try another one");

          }
          break;
        case "go south", "south":
          if (currentRoom.checkSouth()) {
            currentRoom = currentRoom.getSouth();
            System.out.println("You are currently here " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkSouth()) {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;
        case "go west", "west":
          if (currentRoom.checkWest()) {
            currentRoom = currentRoom.getWest();
            System.out.println("You are currently here " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkWest()) {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;
        case "go east", "east":
          if (currentRoom.checkEast()) {
            currentRoom = currentRoom.getEast();
            System.out.println("You are currently here " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkEast()) {
            System.out.println("You cannot go in that direction. Try another one");
          }
          break;
        case "look":
          System.out.println("You are currently here: " + currentRoom.getName());
          System.out.println("\n" + currentRoom.getRoomDescription());
          break;
        case "help":
          System.out.println("\nChoose a direction to go: north, south, west and east.");
          System.out.println("\nother commands: look, help or exit.");
          break;
        case "exit":
          isGameActive = false;
          break;
      }

      /*
      Efter switch, er der også et if-statement, som vil printe en string ud, at spilleren har angivet et forkert input
      og dernæst bliver spilleren ført tilbage til starten af loopet.
      */

      if (playerDirection.equalsIgnoreCase("go north") || playerDirection.equalsIgnoreCase("go south") ||
          playerDirection.equalsIgnoreCase("go west") || playerDirection.equalsIgnoreCase("go east") ||
          playerDirection.equalsIgnoreCase("help") || playerDirection.equalsIgnoreCase("look") ||
          playerDirection.equalsIgnoreCase("exit") || playerDirection.equalsIgnoreCase(" ") ||
          playerDirection.equalsIgnoreCase("north") || playerDirection.equalsIgnoreCase("south") ||
          playerDirection.equalsIgnoreCase("west") || playerDirection.equalsIgnoreCase("east")) {
      } else {
        System.out.println("Sorry! Your input is invalid.. Try again!");
      }

    }



  }
}
