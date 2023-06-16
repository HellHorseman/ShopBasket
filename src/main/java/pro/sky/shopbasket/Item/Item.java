package pro.sky.shopbasket.Item;

public class Item {

    private final Integer item;

    public Item(Integer item) {
        this.item = item;
    }

    public Integer setItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item=" + item +
                '}';
    }
}
