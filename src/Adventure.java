import java.util.Scanner;

public class Adventure {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean isGameActive = false;
    String playerDirection;
    Room currentRoom;

    System.out.println("\nWelcome to the adventure game 1.2");

    Room room1 = new Room("room 1", "It's full of cheese");
    Room room2 = new Room("room 2", "It's full of water");
    Room room3 = new Room("room 3", "It's full of fire");
    Room room4 = new Room("room 4", "It's full of dirt");
    Room room5 = new Room("room 5", "It's full of dust");
    Room room6 = new Room("room 6", "It's full of dogs");
    Room room7 = new Room("room 7", "It's full of flowers");
    Room room8 = new Room("room 8", "It's full of people");
    Room room9 = new Room("room 9", "It's full of alcohol");

    currentRoom = room1;
    room1.setNorth(null);
    room1.setSouth(room4);
    room1.setWest(null);
    room1.setEast(room2);

    room2.setNorth(null);
    room2.setSouth(null);
    room2.setWest(room1);
    room2.setEast(room3);

    room3.setNorth(null);
    room3.setSouth(room6);
    room3.setWest(room2);
    room3.setEast(null);

    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setWest(null);
    room4.setEast(null);

    room5.setNorth(null);
    room5.setSouth(room8);
    room5.setWest(null);
    room5.setEast(null);

    room6.setNorth(room3);
    room6.setSouth(room4);
    room6.setWest(null);
    room6.setEast(room2);

    room7.setNorth(room4);
    room7.setSouth(null);
    room7.setWest(null);
    room7.setEast(room8);

    room8.setNorth(null);
    room8.setSouth(room4);
    room8.setWest(null);
    room8.setEast(room2);

    room9.setNorth(room6);
    room9.setSouth(null);
    room9.setWest(room8);
    room9.setEast(null);



    System.out.println("\nChoose a direction to go: north, south, west and east.");
    System.out.println("\nother commands: go look, go help or go exit.");

    while (!isGameActive) {
      System.out.println("You are in " + currentRoom.getName());
      System.out.println(currentRoom.getRoomDescription());

      playerDirection = in.nextLine();

      if (!playerDirection.equalsIgnoreCase("go north") || playerDirection.equalsIgnoreCase("go south") ||
          playerDirection.equalsIgnoreCase("go west") || playerDirection.equalsIgnoreCase("go east") ||
          playerDirection.equalsIgnoreCase("go help") || playerDirection.equalsIgnoreCase("go look") ||
          playerDirection.equalsIgnoreCase("go exit")) {
        System.out.println("Not a valid input command");
      }

      switch (playerDirection) {
        case "go north":
        if(currentRoom.getNorth() == null) {
          System.out.println("There is no room to enter. Try go in another direction");
      }
        if()


    }


  }

}

}
