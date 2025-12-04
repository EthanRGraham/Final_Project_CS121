public class Main {
    public static void main(String[] args) {
        // Load inventory.csv
        Inventory inventory = new Inventory("inventory.csv");

        POS pos = new POS(inventory);
        pos.showMenu();
    }
}

