public class Item {

    // item properties
    public String itemName;
    public String itemDesc;



    public Item(String itemName, String itemDesc){
        this.itemName = itemName;
        this.itemDesc = itemDesc;

    }

    @Override
    public String toString() {
        return (this.itemName);
    }


}
