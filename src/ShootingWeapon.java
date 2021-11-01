public class ShootingWeapon extends Weapon {

    public int usesLeft;

    public ShootingWeapon (String itemName, String itemDescription, String itemType, int weaponDamage, int bulletsLeft ){
        super(itemName, itemDescription, itemType, weaponDamage);
        this.usesLeft = usesLeft;
    }
    public void setBulletsLeft(int bulletsLeft){
        this.usesLeft = bulletsLeft;
    }
    public int getBulletsLeft(){
        return usesLeft;
    }
}
