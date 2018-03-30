import items.GridCombinedItem;
import items.Item;
import items.ListCombinedItem;
import items.Resource;

public class Main {
    public static void main(String[] args) {

        Item wood = new Resource("Wood", 1);
        Item iron = new Resource("Iron", 2);
        Item rubber = new Resource("Rubber", 1);
        Item sand = new Resource("Sand", 0.5f);

        Item woodBoard = new ListCombinedItem("Board", wood, wood, wood);
        Item pickAxe = new GridCombinedItem("Pickaxe", new Item[][]{
                {iron, iron, iron},
                {null, wood, null},
                {null, wood, null},
                {null, wood, null}
        });

        Item window = new ListCombinedItem("Window", sand, sand, sand, sand);
        Item wire = new ListCombinedItem("Wire", rubber, iron, rubber);

        Item tire = new GridCombinedItem("Tire", new Item[][]{
                {rubber, rubber, rubber},
                {rubber, iron, rubber},
                {rubber, rubber, rubber}
        });

        Item engine = new GridCombinedItem("Engine", new Item[][]{
                {iron, iron, iron},
                {iron, wire, iron},
                {iron, wire, iron},
                {iron, iron, iron}
        });

        Item car = new GridCombinedItem("Car", new Item[][]{
                {iron, iron, iron},
                {engine, window, window},
                {tire, iron, tire}
        });


        System.out.println(car.print());
        System.out.println(pickAxe.print());
        System.out.println(woodBoard.print());
    }
}
