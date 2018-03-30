package items;

public class ListCombinedItem extends Item {
    private final Item[] items;
    private static final double CHARGE = 1.1;
    private float totalPrice = 0;

    public ListCombinedItem(String itemName, Item... items) {
        super(itemName);
        this.items = items;
    }

    @Override
    public String print(int indent) {
        String repeated = new String(new char[indent]).replace('\0', ' ');
        String repeatedList = new String(new char[indent + 2]).replace('\0', ' ');
        StringBuilder itemList = new StringBuilder();
        totalPrice = 0;
        for (Item i : items) {
            itemList.append(repeatedList)
                    .append(i.print())
                    .append("\n");

            totalPrice += i.getItemPrice() * CHARGE;
        }
        return String.format("%s%s - %,.2f Gold %n%s",
                repeated, super.toString(), totalPrice, itemList);
    }

    @Override
    public String print() {
        return print(0);
    }

    @Override
    public float getItemPrice() {
        return totalPrice;
    }


}
