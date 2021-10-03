import java.util.Scanner;

public class Adventure {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean isGameActive = false;
    String playerDirection;

    System.out.println("\nWelcome to the adventure game 1.2");

    Room room1 = new Room();
    Room room2 = new Room();
    Room room3 = new Room();
    Room room4 = new Room();
    Room room5 = new Room();
    Room room6 = new Room();
    Room room7 = new Room();
    Room room8 = new Room();
    Room room9 = new Room();


    while (!isGameActive) {
      System.out.println("\nChoose a direction to go: north, south, west and east\n");

      playerDirection = in.nextLine();

      if (!playerDirection.equalsIgnoreCase("go north") || playerDirection.equalsIgnoreCase("go south") ||
          playerDirection.equalsIgnoreCase("go west") || playerDirection.equalsIgnoreCase("go east") ||
          playerDirection.equalsIgnoreCase("go help") || playerDirection.equalsIgnoreCase("go look") ||
          playerDirection.equalsIgnoreCase("go exit")) {
        System.out.println("Not a valid input command");
      }


    }

  }
}
