package items;

public abstract class Item {
    private final String itemName;

    Item(String itemName) {
        this.itemName = itemName;
    }

    public String print(int indent) {
        String repeated = new String(new char[indent]).replace('\0', ' ');
        return String.format("%s%s", repeated, itemName);
    }

    public String print() {
        return print(0);
    }

    public String getItemName() {
        throw new UnsupportedOperationException();
    }

    public float getItemPrice() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return itemName;
    }
}
