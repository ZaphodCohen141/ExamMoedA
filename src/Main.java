import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      CUSTOMERS:
        Customer c1 = new Customer(1,"a","a","aaa@qq","a",CusType.VIP);
        Customer c2 = new Customer(2,"b","a","aaa@qq","a",CusType.VIP);
        Customer c3 = new Customer(3,"c","a","aaa@qq","a",CusType.REGULAR);
        Customer c4 = new Customer(4,"d","a","aaa@qq","a",CusType.REGULAR);
//      ITEMS:
        Item i1 = new Item(1,"a",20);
        Item i2 = new Item(2,"b",10);
        Item i3 = new Item(3,"c",20);
        ArrayList<Item> items = new ArrayList<>();
        items.add(i1);items.add(i2);items.add(i3);
        LocalDate today = LocalDate.now();

//      ORDERS:
        VIPOrder vip1 = new VIPOrder(1,"a","a",items,c1,Payment.CASH,today);
        VIPOrder vip2 = new VIPOrder(2,"b","a",items,c3,Payment.CASH,today);
        RegularOrder reg1 = new RegularOrder(1,"c","a",items,c1,Payment.OTHER,today);
        RegularOrder reg2 = new RegularOrder(1,"d","a",items,c4,Payment.OTHER,today);
        System.out.println(vip1.getTotalPrice());
        System.out.println(reg1.getTotalPrice());

        System.out.println(c1.getFavorites());
        c1.removeFav(i1);
        System.out.println(c1.getFavorites());
        c1.addFav(i2);
        c1.addFav(i1);
        System.out.println(c1.getFavorites());


        GiftExam g1 = new GiftExam("someww");
        c1.takeGift(g1);
    }
}
