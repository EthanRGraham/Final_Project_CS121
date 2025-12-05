public class Clothing {
    private String name;
    private double price;
    private int stock;
    private int amountSold;
    private Type type;

    public Clothing(String name, double price, int stock, int amountSold, Type type) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.type = type;
        this.amountSold = amountSold;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Type getType() {
        return type;
    }

    public int getamountSold() {
        return amountSold;
    }

    public void updateStock(int amount) {
        stock += amount;
    }

    public void addSale(int qty) {
        amountSold += qty;
        stock -= qty;
    }

    public String toString() {
        return name + " | " + type.toString() + " | Stock: " + stock;
    }

    public String toDetailedString() {
        return 
            "Name: " + name + "\n" +
            "Type: " + type.toString() + "\n" +
            "Price: $" + price + "\n" +
            "Stock: " + stock + "\n" +
            "Total Sold: " + amountSold;
    }
}

