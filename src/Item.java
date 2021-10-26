public class Item {
  private String name;
  private String discover;

  public Item(String name, String discover) {
    this.name = name;
    this.discover = discover;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setDiscover(String discover) {
    this.discover = discover;
  }

  public String getDiscover() {
    return discover;
  }

  public String look() {
    return look();
  }

  @Override
  public String toString() {
    return "Item name=" + name + ", discover=" + discover;
  }
}
