import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Customer implements Gift{
    private int id; //unique
    private String firstName;
    private String lastName;
    private String email;

    private String address;
    private CusType customerType;
    private Double discount;
    private ArrayList<Item> favorites;
    private Gift gift;

    public Customer(int id, String firstName, String lastName, String email, String address, CusType customerType) {
//        if(unique(id)){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.address = address;
            this.customerType = customerType;
            if(this.customerType==CusType.REGULAR){
                this.discount = null;
            }else {
                this.discount = 0.5;
            }
//        }else{
//            System.out.println("customer id is not unique - can't place order");
//        }



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CusType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CusType customerType) {
        this.customerType = customerType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public ArrayList<Item> getFavorites() {
        return favorites;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setFavorites(ArrayList<Item> favorites) {
        this.favorites = favorites;
    }

    public void removeFav(Item item){
        favorites.remove(item);
    }

    public void addFav(Item item){
        if(!this.favorites.contains(item)){
            favorites.add(item);
        }else{
            System.out.println("already in the fav list");
        }
    }
    @Override
    public void takeGift(Gift g) {
        this.gift = g;
        System.out.println(String.format("you got a gift"));
    }

    @Override
    public void openGift() {

    }
    @Override
    public void takeGift() {
        System.out.println("Congratulations! you got a new gift! Enjoy!");
    }
}
