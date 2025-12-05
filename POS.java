import java.util.ArrayList;
import java.util.Scanner;

public class POS {
    private Inventory inventory;
    private ShoppingCart cart;
    private Search search;
    private Scanner scanner;

    public POS(Inventory inventory) {
        this.inventory = inventory;
        this.cart = new ShoppingCart();
        this.search = new Search(inventory);
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
       search.showAllItems(); /* shows all items before search happens*/
       while (true) {
            System.out.println("\n--- POS Menu ---");
            System.out.println("1. Search Items");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                searchMenu();
            } else if (choice == 2) {
                cart.showCart();
            } else if (choice == 3) {
                checkout();
            } else if (choice == 4) {
                break;
            }
        }
    }

    private void searchMenu() {
        System.out.println("Search by: size, type, color");
        String mode = scanner.nextLine();

        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();

        ArrayList<Clothing> results = new ArrayList<>();

        if (mode.equalsIgnoreCase("size"))
            results = search.searchBySize(keyword);
        else if (mode.equalsIgnoreCase("type"))
            results = search.searchByType(keyword);
        else if (mode.equalsIgnoreCase("color"))
            results = search.searchByColor(keyword);

        if (results.isEmpty()) {
            System.out.println("No items found.");
            return;
        }

        System.out.println("--- Results ---");
        for (int i = 0; i < results.size(); i++) {
            System.out.println(i + ") " + results.get(i).toString());
        }

        System.out.print("Select item number to add to cart: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        Clothing selected = results.get(index);
        cart.addItem(selected, qty);
    }

    private void checkout() {
        System.out.println("--- Checkout ---");
        cart.showCart();
        System.out.println("Total: $" + cart.getTotal());

        System.out.println("Confirm purchase? (yes/no): ");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            ArrayList<Clothing> items = cart.getItems();
            ArrayList<Integer> qtys = cart.getQuantities();

            for (int i = 0; i < items.size(); i++) {
                items.get(i).addSale(qtys.get(i));
            }

            inventory.saveInventory();
            cart.clearCart();
            System.out.println("Purchase complete!");
        }
    }
}

