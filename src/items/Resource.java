package items;

public class Resource extends Item {
    private final float itemPrice;


    public Resource(String itemName, float itemPrice) {
        super(itemName);
        this.itemPrice = itemPrice;
    }

    @Override
    public float getItemPrice() {
        return itemPrice;
    }

    @Override
    public String print(int indent) {
        return String.format("%s - %,.2f Gold", super.print(indent), itemPrice);
    }

    @Override
    public String print() {
        return print(0);
    }
}
