package items;

public class GridCombinedItem extends Item {
    private final Item[][] items;
    private float totalPrice = 0;

    public GridCombinedItem(String itemName, Item[][] items) {
        super(itemName);
        this.items = items;
    }

    @Override
    public String print(int indent) {

        StringBuilder itemList = new StringBuilder();
        String repeated = new String(new char[indent]).replace('\0', ' ');
        String repeatedList = new String(new char[indent + 2]).replace('\0', ' ');
        String repeatedResource = new String(new char[indent + 4]).replace('\0', ' ');

        float chargeModifier = (this.items[0].length + this.items.length) * 5;
        totalPrice = 0;

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[0].length; j++) {
                if (items[i][j] != null) {
                    itemList.append(repeatedList)
                            .append(String.format("[%d,%d]", i, j))
                            .append("\n")
                            .append(repeatedList)
                            .append(items[i][j].print())
                            .append("\n");

                    totalPrice += items[i][j].getItemPrice() * (1 + chargeModifier / 100);
                    
                }
            }
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
