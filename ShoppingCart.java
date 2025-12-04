import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Clothing> items;
    private ArrayList<Integer> quantities;

    public ShoppingCart() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Clothing item, int qty) {
        items.add(item);
        quantities.add(qty);
        System.out.println(item.getName() + " added to cart (" + qty + ")");
    }

    public void showCart() {
        System.out.println("----- Shopping Cart -----");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).toString() + " x" + quantities.get(i));
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }

    public void clearCart() {
        items.clear();
        quantities.clear();
    }
}

