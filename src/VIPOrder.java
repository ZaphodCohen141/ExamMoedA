import java.time.LocalDate;
import java.util.ArrayList;

public class VIPOrder extends Order{
    public VIPOrder(int id, String name, String address, ArrayList<Item> itemList, Customer customer, Payment payType, LocalDate orderDate) {
        super(id, name, address, itemList, customer, payType, orderDate);
    }
    @Override
    public double totalPrice(ArrayList<Item> items, Customer c) {
        double newSum = 0;

        if (c.getCustomerType() == CusType.VIP) {
            double discount = c.getDiscount();
            newSum = (Utils.calcItemSum(items) * discount);
        }else{
            System.out.println("this is not VIP customer");
            newSum = Utils.calcItemSum(items);
        }
        return newSum;
    }


}
