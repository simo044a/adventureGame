import java.util.ArrayList;

public class Item {

  private String itemName;
  private String itemDescription;


  public void setItemName(String itemName){this.itemName = itemName;}
  public String getItemName(){return itemName;}

  public void setItemDescription(String itemDescription){this.itemDescription = itemDescription;}
  public String getItemDescription(){return itemDescription;}

  Item(String itemName, String itemDescription){
    setItemName(itemName);
    setItemDescription(itemDescription);
  }

  public String toString(){
    return getItemName() + " " + getItemDescription();
  }





}
