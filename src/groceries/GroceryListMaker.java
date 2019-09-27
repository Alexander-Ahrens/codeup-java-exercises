package groceries;

public class GroceryListMaker {

    private String name;
    private String Category;
    private int quantity;

    public GroceryListMaker(String name, String category, int quantity) {
        this.name = name;
        Category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
