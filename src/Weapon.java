import java.util.ArrayList;

public class Weapon extends Item{

  private double weaponDamage;

  public void setWeaponDamage(double weaponDamage){this.weaponDamage = weaponDamage;}
  public double getWeaponDamage(){return weaponDamage;}

  Weapon(String itemName, String itemDescription, String itemType, double weaponDamage) {
    super(itemName, itemDescription, itemType);
    setWeaponDamage(weaponDamage);
  }
}
