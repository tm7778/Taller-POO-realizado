import java.util.ArrayList;

public class Function_Inventory {
   private ArrayList<Product_specific> productsLists;

    public Function_Inventory() {
        this.productsLists = new ArrayList<>();
    }

    public void addProduct(Product_specific product){
        this.productsLists.add(product);
    }
}
