import java.util.Scanner;

public class MainHandler implements UserInterface {


    private Scanner scanner = new Scanner(System.in);
    private Shop shop;

    public MainHandler() {
        this.shop = new Shop("no name");
        shop.addNewItem(new Item("banan", 2.50, 10));
        shop.addNewItem(new Item("apple", 2.20, 6));
        shop.addNewItem(new Item("beer", 2.20, 6));
    }

    @Override
    public void showProduct() {

        shop.showProducts();

    }

    @Override
    public Item buyProduct() {

        System.out.println("Choice name of product: ");
        String name = scanner.next();
        System.out.println("How much: ");
        int qty = scanner.nextInt();

        Item item = shop.findProductByName(name);

        if(item != null ){
            item.sell(qty);
            System.out.println(name + " : sprzedano " + qty);
        }



        return null;
    }

    public Shop getShop() {
        return shop;
    }
}
