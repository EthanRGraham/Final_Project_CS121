# Clothing and Type class 
    load Inventory from CSV file
    For each line in CSV:
        Parse name, type, size, color, stock, price, production cost
        
# public interface HasMenu 
    String Menu();
    void start();

# Main
if user input = 0 
else if input = 1
              = 2
else: try again! 0- #
## loadClothing()
    pull from csv file
    use this example:
    https://github.com/twopiharris/BSU-CS121/blob/main/java_data/%23ReadFile.java%23

## int Menu()
    ---------------------
    0) Inventory
    1) Report
    2) Start POS System
    ---------------------
    return int input
    
## showInventory()
    simply print out inventory
    for number of lines in csv file
    System.out.println()

## report()
    take each item's amount sold variable
    print the name, amount sold, and amount sold x item price.
    
    
```mermaid
classDiagram
    Main o-- Search
    class Main{
    }
    Clothing o-- Main
    Clothing o-- Type
    class Clothing{
        Clothing : -String name
        Clothing : -double price
        Clothing : -int stock
        Clothing : -double productionCost
        Clothing : -int totalSold 
        Clothing : -type: Type
    
        + getName(): String
        + getPrice(): double
        + getType(): Type
        + getStock(): int
        + updateStock(int amount)
        + addSale(int)
        + ConverttoString()
        + fullDetailedString()
    }
    class Type{
        - String clothingColor
        - String clothingType
        - String clothingSize
        - 
        getClothingType() String
        getSize() String
        getColor() String
        ConverttoString()
    }
    Inventory  o-- Clothing
    class Inventory{
        - items: ArrayList<Clothing>  
        - csvfilePath

        + Inventory(csvFilePath: String)
        + loadCSV()
        + saveInventory()
        + getItems() Arraylist<Clothing>
    }
    class Search{
      - inventory: Inventory 
    
        + Search(inventory: Inventory )       
        + searchBySize(size: String): ArrayList<Clothing>
        + searchByColor(color: String): ArrayList<Clothing>
        + searchByType(typeText: String): ArrayList<Clothing>
        + sortByStock(): ArrayList<Clothing>


    }
    POS o-- Search
    Clothing o-- POS
    class POS {
        - inventory: Inventory
        - cart: ShoppingCart

        HasMenu()
        + POS(inventory: Inventory)
        + sellItem(item: Clothing, qty: int)
        + checkout()        
    }
ShoppingCart o-- POS
class ShoppingCart{
    - items: Arraylist<Clothing>
    - quantities: Arraylist<Integer>

    + addItem(item: Clothing, qty: int)
    + removeItem(item: Clothing)
    + getTotal() double
    + showCart()
    + clearCart()
    
}




```
