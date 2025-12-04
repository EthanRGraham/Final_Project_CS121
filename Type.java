public class Type {
    private String clothingType;
    private String size;
    private String color;

    public Type(String clothingType, String size, String color) {
        this.clothingType = clothingType;
        this.size = size;
        this.color = color;
    }

    public String getClothingType() {
        return clothingType;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return clothingType + " / " + size + " / " + color;
    }
}

