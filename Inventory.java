import java.io.*;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Clothing> items;
    private String filePath;

    public Inventory(String filePath) {
        this.filePath = filePath;
        this.items = new ArrayList<>();
        loadCSV();
    }

    private void loadCSV() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // header row

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                String type = parts[1];
                String size = parts[2];
                String color = parts[3];
                int stock = Integer.parseInt(parts[4]);
                double price = Double.parseDouble(parts[5]);
                int amountSold = Integer.parseInt(parts[6]);

                Type typeObj = new Type(type, size, color);
                Clothing clothing = new Clothing(name, price, stock, amountSold, typeObj);

                items.add(clothing);
            }
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    public void saveInventory() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            pw.println("name,type,size,color,stock,price,amountSold");

            for (Clothing c : items) {
                pw.println(
                    c.getName() + "," +
                    c.getType().getClothingType() + "," +
                    c.getType().getSize() + "," +
                    c.getType().getColor() + "," +
                    c.getStock() + "," +
                    c.getPrice() + "," +
                    c.getamountSold()
                );
            }
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public ArrayList<Clothing> getItems() {
        return items;
    }
}

