public class Product_specific extends Product {
    private String category;

    public Product_specific(int id, String name, double price, String category) {
        super(id, name, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
