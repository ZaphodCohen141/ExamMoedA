import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    private int id; //unique
    private String name;
    private String address;
    private ArrayList<Item> itemList;
    private Customer customer;
    private double totalPrice;
    private Payment payType;
    private LocalDate orderDate;
    private ArrayList<Integer> idList;

    public Order(int id, String name, String address, ArrayList<Item> itemList, Customer customer, Payment payType, LocalDate orderDate) {
//        if(unique(id)){
            this.id = id;
            this.name = name;
            this.address = address;
            this.itemList = itemList;
            this.customer = customer;
            this.totalPrice = totalPrice(this.itemList,this.customer);
            this.payType = payType;
            this.orderDate = orderDate;
            addToFav(itemList,customer);
//        for (int i = 0; i < itemList.size(); i++) {
//            addToFav(itemList.get(i), customer);
//        }
//        }else{
//            System.out.println("the order id is not unique - can't place order");
//        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Payment getPayType() {
        return payType;
    }

    public void setPayType(Payment payType) {
        this.payType = payType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public double totalPrice(ArrayList<Item> itemList, Customer c){
        return Utils.calcItemSum(itemList);
    }

    public List<Integer> getIdList() {
        return idList;
    }

        public void addToFav(ArrayList<Item> items, Customer c) {
            ArrayList<Item> fav = new ArrayList<>();
            for (int i = 0; i < items.size(); i++) {
                if (c.getFavorites() == null) {
                    fav.add(items.get(i));
                    c.setFavorites(fav);
                } else if (!c.getFavorites().contains(items.get(i))) {
                    fav.add(items.get(i));
                    c.setFavorites(fav);
                }
            }
        }


//    public boolean unique(int id){
//        boolean flag;
//        if(this.idList.contains(id)){
//            flag = false;
//            System.out.println("nay");
//        }else{
//            System.out.println("yay");
//            this.idList.add(id);
//            flag = true;
//        }
//        return flag;
//    }

}
