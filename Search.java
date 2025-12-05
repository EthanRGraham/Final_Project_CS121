import java.util.ArrayList;

public class Search {
    private Inventory inventory;

    public Search(Inventory inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Clothing> searchBySize(String size) {
        ArrayList<Clothing> results = new ArrayList<>();

        for (Clothing item : inventory.getItems()) {
            if (item.getType().getSize().equalsIgnoreCase(size)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<Clothing> searchByColor(String color) {
        ArrayList<Clothing> results = new ArrayList<>();

        for (Clothing item : inventory.getItems()) {
            if (item.getType().getColor().equalsIgnoreCase(color)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<Clothing> searchByType(String type) {
        ArrayList<Clothing> results = new ArrayList<>();

        for (Clothing item : inventory.getItems()) {
            if (item.getType().getClothingType().equalsIgnoreCase(type)) {
                results.add(item);
            }
        }
        return results;
    }
    public void showAllItems() {
    	System.out.println("\n----- Full Inventory -----");
    	for (Clothing c : inventory.getItems()) {
        	System.out.println(c.toString());
	}
	System.out.println("--------------------------\n");
}

}

