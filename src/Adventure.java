import java.util.Scanner;
public class Adventure {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    boolean isGameActive = false;
    String playerDirection;

    System.out.println("\nWelcome to the adventure game 1.0");


    Room currentRoom = new Room("room 1", "\nThe room is full of cheese...");


    do {
      System.out.println("\nChoose a direction to go: north, south, west and east\n");

      playerDirection = in.nextLine();

      if(playerDirection.equals("go north")){
        System.out.println("Going north");
      } else if(playerDirection.equals("go south")){
        System.out.println("Going south");
      } else if (playerDirection.equals("go west")){
        System.out.println("Going west");
      } else if(playerDirection.equals("go east")){
        System.out.println("Going east");
      } else if(playerDirection.equals("look")){
        System.out.println(currentRoom);
      } else if(playerDirection.equals("exit")) {
        isGameActive = true;
      } else {
        System.out.println("Sorry, what you typed in were invalid! Try again.");
      }

    } while(!isGameActive);

  }

}
