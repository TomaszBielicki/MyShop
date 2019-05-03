import java.util.ArrayList;
import java.util.List;

public class Shop
{
    private String shopName;
    private List<Item> productList;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.productList = new ArrayList<>();
    }

    public List<Item> getProductList() {
        return productList;
    }
    public boolean addNewItem(Item newItem){

        if (newItem != null) {
            return productList.add(newItem);
        }
        return false;
    }
    public void showProducts(){

        for (Item item:productList){
            System.out.println(item);
        }
    }
    public Item findProductByName(String name){
        for (Item item:productList){
            if (item.getName().equals(name)){
                return item;
            }
        }
        System.out.println("Nie znaleziono itemu " + name);
        return null;
    }
    public boolean removeName(String name){

        for (Item item:productList){
            if (item.getName().equals(name)) {
                System.out.println(item.getName() + " został usunięty");
                return productList.remove(item);
            }
        }
        System.out.println("Nie ma produktu: " + name);
        return false;
    }
}
