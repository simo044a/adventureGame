public class Food extends Item {

  private double healingValue;

  Food(String itemName, String itemDescription, double healingValue) {
    super(itemName, itemDescription);
    setHealingValue(healingValue);
  }

  public void setHealingValue(double healingValue){this.healingValue = healingValue;}
  public double getHealingValue(){return healingValue;}

}
