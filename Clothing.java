public class Clothing {
    private String name;
    private double price;
    private int stock;
    private double productionCost;
    private int totalSold;
    private Type type;

    public Clothing(String name, double price, int stock, double productionCost, Type type) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.productionCost = productionCost;
        this.type = type;
        this.totalSold = 0;
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

    public int getTotalSold() {
        return totalSold;
    }

    public void updateStock(int amount) {
        stock += amount;
    }

    public void addSale(int qty) {
        totalSold += qty;
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
            "Production Cost: $" + productionCost + "\n" +
            "Total Sold: " + totalSold;
    }
}

