import java.util.ArrayList;

public class Order {
    Item item = new Item();
    
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();
}
