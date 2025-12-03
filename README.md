
# Main.cpp
    inventory = new Inventory("inventory.csv")
    pos = new POS(inventory)
    pos.Menu()

# Class Type
    private clothingType
    private size
    private color

    Contructor Type(typeText, sizeText, colorText)
        clothingType = typeText
        size = sizeText
        color = colorText

    getClothingType()
        return clothingType
    
    getSize()
        return size

    getColor()
        return color

    convertToString()
        return clothingType + "/" + size + "/" + color "/"

#Clothing class

    PRIVATE name
    PRIVATE price
    PRIVATE stock
    PRIVATE productionCost
    PRIVATE totalSold
    PRIVATE type 
    
    
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
