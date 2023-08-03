public class GiftExam implements Gift{
    String gift;

    public GiftExam(String gift) {
        this.gift = gift;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public void takeGift() {

    }

    @Override
    public void takeGift(Gift g) {

    }

    @Override
    public void openGift() {

    }
}
