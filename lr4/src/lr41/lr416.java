package lr41;

public class lr416 {
    public static void main(String[] args) {
        Shop shop = new Shop("Dicksy");
        Shop.Storage s = shop.new Storage();
        System.out.println(shop);
        s.add_department("toys");
        s.add_department("long things");
        s.add_goods("balls");
        s.add_goods("Cucumbers");
        s.add_service("Delivery");
        System.out.println(s);
    }
}
