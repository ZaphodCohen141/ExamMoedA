import java.util.ArrayList;

public class Utils {

    public static double calcItemSum(ArrayList<Item> items){
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getPrice();
        }
        return sum;
    }

}
