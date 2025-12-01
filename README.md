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
        loadClothing()
        showInventory()
        report()
        HasMenu()
    }
    Clothing o-- Main
    Clothing o-- Type
    class Clothing{
        Clothing : -String name
        Clothing : -int price
        Clothing : -int stock
        Clothing : -int productionCost
    
        Clothing()
        getType()
        readCSVfile()
    }
    class Type{
        -String color
        -String clothingType
        -String clothingSize
        Type()
        readCSVfile()
    }
    class Search{
        HasMenu()
        getClothingType()
        getClothingSize()
        getClothingColor()
        SearchbyType()

    }
    POS o-- Search
    Clothing o-- POS
    class POS {
        HasMenu()
        loadClothing()
        UpdateInventory()
        additem() to shoppingCart
        sellItem()

    }
shoppingCart o-- POS
class shoppingCart{
    int numItems
    int cart_total
    purchase()
    removeItem()

}




```
