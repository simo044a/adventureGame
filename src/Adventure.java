import java.util.Scanner;

public class Adventure {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean isGameActive = false;
    String playerDirection;
    Room currentRoom;

    System.out.println("\nWelcome to the adventure game 1.2");

    Room room1 = new Room("room 1", "\nIt's full of cheese");
    Room room2 = new Room("room 2", "\nIt's full of water");
    Room room3 = new Room("room 3", "\nIt's full of fire");
    Room room4 = new Room("room 4", "\nIt's full of dirt");
    Room room5 = new Room("room 5", "\nIt's full of dust");
    Room room6 = new Room("room 6", "\nIt's full of dogs");
    Room room7 = new Room("room 7", "\nIt's full of flowers");
    Room room8 = new Room("room 8", "\nIt's full of people");
    Room room9 = new Room("room 9", "\nIt's full of alcohol");

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

    room8.setNorth(room5);
    room8.setSouth(null);
    room8.setWest(room7);
    room8.setEast(room9);

    room9.setNorth(room6);
    room9.setSouth(null);
    room9.setWest(room8);
    room9.setEast(null);


    System.out.println("\nChoose a direction to go: north, south, west and east.");
    System.out.println("\nother commands: go look, go help or go exit.");


    System.out.println("You are in " + currentRoom.getName());
    System.out.println(currentRoom.getRoomDescription());

    while (!isGameActive) {

      playerDirection = in.nextLine();

      switch (playerDirection) {
        case "go north":
          if (currentRoom.checkNorth()) {
            currentRoom = currentRoom.getNorth();
            System.out.println("You are in " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkNorth()) {
            System.out.println("There is no room in that direction. Try another one");

          }
          break;
        case "go south":
          if (currentRoom.checkSouth()) {
            currentRoom = currentRoom.getSouth();
            System.out.println("You are in " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkSouth()) {
            System.out.println("There is no room in that direction. Try another one");
          }
          break;
        case "go west":
          if (currentRoom.checkWest()) {
            currentRoom = currentRoom.getWest();
            System.out.println("You are in " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkWest()) {
            System.out.println("There is no room in that direction. Try another one");
          }
          break;
        case "go east":
          if (currentRoom.checkEast()) {
            currentRoom = currentRoom.getEast();
            System.out.println("You are in " + currentRoom.getName());
            System.out.println("\n" + currentRoom.getRoomDescription());
          } else if (!currentRoom.checkEast()) {
            System.out.println("There is no room in that direction. Try another one");
          }
          break;
        case "go look":
          System.out.println("You are in " + currentRoom.getName());
          System.out.println("\n" + currentRoom.getRoomDescription());
          break;
        case "go help":
          System.out.println("\nChoose a direction to go: north, south, west and east.");
          System.out.println("\nother commands: go look, go help or go exit.");
          break;
        case "go exit":
          isGameActive = true;
          break;

        }


      }


    }

  }

}
