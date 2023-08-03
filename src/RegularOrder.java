import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{
    public RegularOrder(int id, String name, String address, ArrayList<Item> itemList, Customer customer, Payment payType, LocalDate orderDate) {
        super(id, name, address, itemList, customer, payType, orderDate);
    }

}
