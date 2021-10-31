import java.util.ArrayList;

public class Item {

  private String itemName;
  private String itemDescription;
  private String itemType;

  public void setItemName(String itemName){this.itemName = itemName;}
  public String getItemName(){return itemName;}

  public void setItemDescription(String itemDescription){this.itemDescription = itemDescription;}
  public String getItemDescription(){return itemDescription;}

  public void setItemType(String itemType){this.itemType = itemType;}
  public String getItemType(){return itemType;}

  Item(String itemName, String itemDescription, String itemType){
    setItemName(itemName);
    setItemDescription(itemDescription);
    setItemType(itemType);
  }


  public String toString(){
    return getItemName() + " " + getItemDescription();
  }
  
}
