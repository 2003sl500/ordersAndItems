import java.text.DecimalFormat;

public class TestOrders{
    public static void main(String[] args) {

        DecimalFormat f = new DecimalFormat("$###,##0.00");

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.25;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.30;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 4.25;

        Order order1 = new Order();
        order1.name = "Cindhuri";
        System.out.println(order1.name + ", original Balance: " + f.format(order1.total));
        order1.ready = true;
        System.out.println(order1.name + ", your order is ready: " + order1.ready);
        System.out.println();

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        System.out.println(order2.name + ", your order is ready: " + order2.ready);
        System.out.println(order2.name + ", current Balance: " + f.format(order2.total));
        System.out.println();

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.name + ", current Balance: " + f.format(order3.total));
        System.out.println();

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price * 2);
        System.out.println(order4.name + ", current Balance: " + f.format(order4.total));
        System.out.println();
    }
}