import java.util.Scanner;
import java.util.ArrayList;

public class Adventure {

  Scanner in = new Scanner(System.in);
  boolean isGameActive = true; // boolean værdi til while-loop, for at køre spillet, indtil der gives et exit input.
  String playerDirection; // String input til spilleren, som bliver checket i switch og if-loop.
  ArrayList<Item> inventory = new ArrayList<Item>();
  ArrayList<Weapon> weaponEquipment = new ArrayList<>();

  ArrayList<Item> itemRoom1 = new ArrayList<>();
  ArrayList<Item> itemRoom2 = new ArrayList<>();
  ArrayList<Item> itemRoom3 = new ArrayList<>();
  ArrayList<Item> itemRoom4 = new ArrayList<>();
  ArrayList<Item> itemRoom5 = new ArrayList<>();
  ArrayList<Item> itemRoom6 = new ArrayList<>();
  ArrayList<Item> itemRoom7 = new ArrayList<>();
  ArrayList<Item> itemRoom8 = new ArrayList<>();
  ArrayList<Item> itemRoom9 = new ArrayList<>();
  ArrayList<Item> enemyInv = new ArrayList<>();
  ArrayList<Weapon> enemyWeaponInv = new ArrayList<>();
  boolean enemyRaiderHasDied;

  Room room1;
  Room room2;
  Room room3;
  Room room4;
  Room room5;
  Room room6;
  Room room7;
  Room room8;
  Room room9;

  Food itemRoomSoda = new Food("Soda", ", a bottle you can drink from", "food", 25);
  Food itemRoomCannedMeat = new Food("Canned meat", ", if you ever get hungry", "food", 30);
  Weapon itemRoomKnife = new Weapon("Knife", ", a weapon you could use against enemies", "weapon", 22);
  Item itemRoomKeyCard = new Item("Keycard", ", might give access to somewhere", "key");

  Weapon itemRoomPipeIron = new Weapon("pipe iron", "A powerful weapon", "weapon", 20);


  Enemy enemyRaider = new Enemy("Raider", enemyInv, 60, true);


  Player player1 = new Player("player 1", inventory, 100, true);


  public void rooms() {

    room1 = new Room("\nArea 1", """
        You're at a road with trashed vehicle one way, the other way is
        full of mutated creatures in the distant. The road goes
        along a steep hill. Across the road, a big building.""");

    room2 = new Room("\nArea 2", """
        This area has a thick fog. Looking around, you notice some destroyed
        and burned vehicles, and you can hear some kind of howls in the distance,
        but it doesn't sound like wolfs or dogs, but bigger and more human.
        The buildings in this area looks like they have been abandoned a long time ago.""");

    room3 = new Room("\nArea 3", """
        The fog is fading a bit, the buildings here are destroyed.
        The sky is filled with birds, looks like crows but kinda big. Maybe ravens?
        There is only on way trough south, and that is a hole in the ground.
        It looks like the road has collapsed down in to a old metro.""");

    room4 = new Room("\nArea 4", """
        This area has broken and half burned shops and apartments. It was once filled with life
        but it's dead and silent now. It looks like there is trash along the road but when you look closer,
        you notice its only cloth, shoes and old suitcases looking like something from old soviet Russia.
        The area gives you the feeling of dread and people most have been in a rush.
        The shops a boarded shut and you are only able to keep walking the same path forward.""");

    room5 = new Room("\nArea 5", """
        The elevator goes all the way up to the roof without giving you a chanceto pick any floor.
        The elevator does open half way up, just enough for you to squeeze through.
        The helicopter looks out of place, since it looks all new with no scratches or anything.
        This is your way out of what ever this place is!""");

    room6 = new Room("\nArea 6", """
        As soon as you jump down from the edge of the road hanging down from the upper level, you land in water.
        It comes as a surprise because it was so still that it looked like dirt.
        It's not that deep but reach up to your knees.
        When you look up, you can see the birds through the hole, flying around, kinda fighting in the air.
        But when you look around, you notice how dark it's actually is when you are down here.
        The light from the hole you came from, shows that the metro is collapsed, making it only possible
        to take one path from here, in to darkness.""");

    room7 = new Room("\nArea 7", """
        You come to a road block. There have been a lot of military here, blocking the road.
        The area have proof of combat. Bullet holes on the walls, the road have craters from grenades.
        The buildings in this area is destroyed and the only thing that looks like it haven't seen
        combat is the hospital in the distance, behind some of the roadblocks and military vehicles.""");

    room8 = new Room("\nArea 8", """
        You are now standing inside of a hospital lounge. Around you is hospital beds, half emptied
        first-aid kits and an empty vending machine with broken glass. You can also see an elevator
        which seems to be working and over it you can see a sign stating that there is a
        helipad on the top floor of the building.""");

    room9 = new Room("\nArea 9", """
        You are still surrounded by water up to your knees. A train stationed in front of you is lit up
        by an opening further ahead which looks like the way back up to the surface.""");


    // Her bliver attributterne tildelt, for hvordan hvert rum ligger i forhold til hinandens retninger.

    itemRoom2.add(itemRoomSoda);
    itemRoom7.add(itemRoomKnife);
    itemRoom4.add(itemRoomCannedMeat);
    itemRoom6.add(itemRoomKeyCard);

    room1.setSouth(room4);
    room1.setEast(room2);
    room1.setRoomContent(itemRoom1);

    room2.setWest(room1);
    room2.setEast(room3);
    room2.setRoomContent(itemRoom2);

    room3.setSouth(room6);
    room3.setWest(room2);
    room3.setRoomContent(itemRoom3);

    room4.setNorth(room1);
    room4.setSouth(room7);
    room4.setRoomContent(itemRoom4);

    room5.setSouth(room8);
    room5.setRoomContent(itemRoom5);
    room5.setRoomContent(itemRoom5);


    room6.setNorth(room3);
    room6.setSouth(room9);
    room6.setRoomContent(itemRoom6);

    room7.setNorth(room4);
    room7.setEast(room8);
    room7.setRoomContent(itemRoom7);

    room8.setNorth(room5);
    room8.setWest(room7);
    room8.setEast(room9);
    room8.setRoomContent(itemRoom8);
    enemyRaider.setCurrentRoom(room8);

    room9.setNorth(room6);
    room9.setWest(room8);
    room9.setRoomContent(itemRoom9);

  }

  // Commands
  public void goNorth() {

    if (player1.getCurrentRoom().getNorth() != null) {
      player1.setCurrentRoom(player1.getCurrentRoom().getNorth());
      System.out.println("You are currently here: \n" + player1.getCurrentRoom().getName() + "\n" +
          "" + player1.getCurrentRoom().getRoomDescription() + "" + player1.getCurrentRoom().getRoomItem());
    } else {
      System.out.println("You cannot go in that direction. Try another one");
    }
  }

  public void goSouth() {

    if (player1.getCurrentRoom().getSouth() != null) {
      player1.setCurrentRoom(player1.getCurrentRoom().getSouth());
      System.out.println("You are currently here: \n" + player1.getCurrentRoom().getName() + "\n" +
          "" + player1.getCurrentRoom().getRoomDescription());
    } else {
      System.out.println("You cannot go in that direction. Try another one");
    }
  }

  public void goWest() {

    if (player1.getCurrentRoom().getWest() != null) {
      player1.setCurrentRoom(player1.getCurrentRoom().getWest());
      System.out.println("You are currently here: \n" + player1.getCurrentRoom().getName() + "\n" +
          "" + player1.getCurrentRoom().getRoomDescription());
    } else {
      System.out.println("You cannot go in that direction. Try another one");
    }
  }

  public void goEast() {

    if (player1.getCurrentRoom().getEast() != null) {
      player1.setCurrentRoom(player1.getCurrentRoom().getEast());
      System.out.println("You are currently here: \n" + player1.getCurrentRoom().getName() + "\n" +
          "" + player1.getCurrentRoom().getRoomDescription());
    } else {
      System.out.println("You cannot go in that direction. Try another one");
    }
  }

  public void goLook() {

    System.out.println("You are currently here: \n" + player1.getCurrentRoom().getName());
    if (player1.getCurrentRoom().getRoomContent() != null) {
      itemRoomTake();
    } else {
      System.out.println("There seem to be no items laying around...");
    }
    if (player1.getCurrentRoom() == enemyRaider.getCurrentRoom()) {
      System.out.println(enemyRaider.getPlayerName() + " appeared! Seems like a threat");
      player1.setCurrentEnemy(enemyRaider);
    }



  }

  public void goInv() {

    System.out.println("You currently have this in your inventory");
    System.out.println(player1.getInventory());
    if (player1.getInventory().size() == 0) {
      System.out.println("You have nothing in your inventory...");
      roomDes();
    }

    if (player1.getInventory().size() != 0) {

      System.out.println("\nIs there anything you want to do with your inventory? (input: use/drop/leave)");

      String invenInput = in.nextLine();

      switch (invenInput) {

        case "drop":
          itemRoomDrop();
          break;
        case "leave":
          System.out.println("Closing inventory");
          roomDes();

          break;

        case "use":

          itemUse();
          break;


        default:
          System.out.println("Sorry! Invalid input.. try again!");
          break;
      }


    }
  }

  public void goPlayerHealth() {
    System.out.println("Player current health: " + player1.getPlayerHealth());
  }

  public boolean isEnemyDead(){

    if (player1.getCurrentEnemy().getPlayerHealth() > 0){
      enemyRaiderHasDied = false;
      return false;
    } else {
      return true;
    }

  }

  // Item commands
  public void itemRoomTake() {


    System.out.println("You look around the area to see if there is any items you could pick up..");

    if (player1.getCurrentRoom().getRoomContent().size() == 0) {
      System.out.println("No item in room");
    } else {
      System.out.println(player1.getCurrentRoom().getRoomContent());

      System.out.println("Would you like to take anything? (yes/no)");

      String yesNo = in.nextLine();

      switch (yesNo) {


        case "yes", "y":
          System.out.println("What item index would you like to take? (write the index number)");

          int x = in.nextInt();

          System.out.println("You choose index: " + player1.getCurrentRoom().getRoomContent().get(x));

          player1.takeItem(player1.getCurrentRoom().getRoomContent().get(x));
          player1.getCurrentRoom().dropRoomContent(player1.getCurrentRoom().getRoomContent().get(x));

          System.out.println("Your inventory: ");
          System.out.println(player1.getInventory());
          System.out.println("Current room content: ");
          System.out.println(player1.getCurrentRoom().getRoomContent());

          break;

        case "no", "n":
          System.out.println("Leaving item(s) alone");
          break;

        default:
          System.out.println("Sorry! Invalid input...");
          break;

      }

    }

  }

  public void itemRoomDrop() {

    player1.getInventory();

    if (player1.getInventory().size() == 0) {
      System.out.println("Sorry, your inventory is empty");
    } else {
      System.out.println("What item item index would you like to drop? (write the index number)");

      int y = in.nextInt();

      System.out.println("You choose item index: " + y + ", " + player1.getInventory().get(y));


      player1.getCurrentRoom().addRoomContent(player1.getInventory().get(y));
      player1.getInventory().remove(y);

      System.out.println("Your inventory: ");
      System.out.println(player1.getInventory());
      System.out.println("Current room content: ");
      System.out.println(player1.getCurrentRoom().getRoomContent());


    }

  }

  public void itemUse() {

    System.out.println(player1.getInventory());

    System.out.println("What item would you like to use?");

    int inputItemUse = in.nextInt();

    if (player1.getInventory().get(inputItemUse).getItemType().equalsIgnoreCase("food")) {

      Food objFood = (Food) player1.getInventory().get(inputItemUse);

      itemHealing(objFood);

    } else if (player1.getInventory().get(inputItemUse).getItemType().equalsIgnoreCase("weapon") && weaponEquipment.size()==0) {
      Weapon objWeapon = (Weapon) player1.getInventory().get(inputItemUse);
     itemEquip(objWeapon);
    }




  }

  public void itemHealing(Food food) {

    System.out.println("Player is healing..");

    player1.setPlayerHealth(player1.getPlayerHealth() + food.getHealingValue());
    goPlayerHealth();

    System.out.println("Removing item...");
    player1.getInventory().remove(food);
    System.out.println("player inventory: " + player1.getInventory());


  }

  public boolean isWeaponEquip() {
    if(player1.getCurrentWeapon() == null){
      return true;
    } else {
      return false;
    }
  }
  public void itemEquip(Weapon weapon) {

    player1.setCurrenWeapon(weapon);
    System.out.println("current equipped: " + player1.getCurrentWeapon());

  }

  public void attackSeq() {


    if (!isWeaponEquip() && (player1.getCurrentRoom() != player1.getCurrentEnemy().getCurrentRoom())) {
      System.out.println("You attacked the empty space");
    }
    if (!isWeaponEquip() && player1.getCurrentRoom() == enemyRaider.getCurrentRoom() && player1.getCurrentEnemy().getIsPlayerAlive()) {
      player1.getCurrentEnemy().setPlayerHealth(player1.getCurrentEnemy().getPlayerHealth() - player1.getCurrentWeapon().getWeaponDamage());
      System.out.println((player1.getCurrentEnemy().getPlayerHealth() - player1.getCurrentWeapon().getWeaponDamage()));
      System.out.println("You attacked the enemy " + player1.getCurrentEnemy().getPlayerName() + " with a damage amount of " + player1.getCurrentWeapon().getWeaponDamage());

      System.out.println("Enemy current health " + player1.getCurrentEnemy().getPlayerHealth());

      System.out.println("Enemy " + player1.getCurrentEnemy().getPlayerName() + " attacks you!");
      player1.setPlayerHealth(player1.getPlayerHealth() - (player1.getCurrentEnemy().getCurrentWeapon().getWeaponDamage()));

      goPlayerHealth();

    }
      if (!enemyRaiderHasDied) {
        if (isEnemyDead()) {
          player1.getCurrentEnemy().setIsPlayerAlive(false);
          System.out.println(player1.getCurrentEnemy().getPlayerName() + " died! Good job");
          enemyRaiderHasDied = true;
          player1.getCurrentEnemy().setCurrentRoom(null);
        }
    }

    if(isWeaponEquip()){
      System.out.println("You have nothing equipped to attack with...");
    }


  }


  // Items/inv relaterede methods

  // Forskellige room relaterede methods

  public void roomLoop() {

    player1.setCurrentRoom(room1);
    player1.setCurrentEnemy(enemyRaider);
    enemyRaider.setCurrenWeapon(itemRoomPipeIron);

    while (isGameActive) {



        playerDirection = in.nextLine(); //Alt input fra spilleren sker her.



      /*I dette switch loop, tjekker input playerDirection om de giver et valid input. Alt efter hvilket rum spilleren
      befinder sig i, og hvilken retning de vælger, ændres variablen "currentRoom". Dernæst opdateres currenRoom til det
      nye rum, og udprinter navnet på rummet, samt en beskrivelse.*/

      switch (playerDirection) {
        case "go north", "north", "n":
          goNorth();
          break;

        case "go south", "south", "s":
          goSouth();
          break;

        case "go west", "west", "w":
          goWest();
          break;

        case "go east", "east", "e":
          goEast();
          break;

        case "look":
          goLook();
          break;

        case "help":
          System.out.println("""
              Choose a direction to go: north, south, west and east.
              Other commands: look, help, inv or exit.""");
          break;

        case "inv":
          goInv();

          break;

        case "health":
          goPlayerHealth();

          break;

        case "attack", "a":
          attackSeq();

          break;

        case "exit":
          isGameActive = false;
          break;

        default:
          break;
      }

      if (player1.getPlayerHealth() <= 0) {
        player1.setIsPlayerAlive(false);
        System.out.println("Your health went below zero! You died... Ending game.");
        if (player1.getIsPlayerAlive() == true);
        isGameActive = false;
      }

    }

  }

  public void roomDes() {
    System.out.println(player1.getCurrentRoom().getName() + "\n " + player1.getCurrentRoom().getRoomDescription());
  }

  public static void main(String[] args) {

    Adventure roomMethods = new Adventure();

    roomMethods.rooms();

    // Her gives en introduktion til spillet handling og input muligheder.
    System.out.println("""
         
        Welcome to the adventure game! The map consist of nine areas.
               
        Choose a direction to go: north, south, west and east.
               
        Helpful commands: "look", for getting the name and description of the current area - and checking for items and enemies in the area,
        or write "exit" to end the game.
        
        "inv" to check your current inventory - "use" to consume or equip items, and "drop" to leave an item in the current area.
         
        "You wake up in a van. You go outside to check your surroundings."
         """);


    roomMethods.roomLoop();


  }

}
