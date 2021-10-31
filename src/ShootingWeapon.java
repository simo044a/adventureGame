public class ShootingWeapon extends Weapon {

    public int bulletsLeft;

    public ShootingWeapon (String itemName, String itemDescription, String itemType, int weaponDamage, int bulletsLeft ){
        super(itemName, itemDescription, itemType, weaponDamage);
        this.bulletsLeft = bulletsLeft;
    }
    public void setBulletsLeft(int bulletsLeft){
        this.bulletsLeft = bulletsLeft;
    }
    public int getBulletsLeft(){
        return bulletsLeft;
    }
}
