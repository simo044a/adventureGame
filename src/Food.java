public class Food extends Item {

  private double healingValue;

  Food(String itemName, String itemDescription, String itemType, double healingValue) {
    super(itemName, itemDescription, itemType);
    setHealingValue(healingValue);
  }

  public void setHealingValue(double healingValue){this.healingValue = healingValue;}
  public double getHealingValue(){return healingValue;}


}
