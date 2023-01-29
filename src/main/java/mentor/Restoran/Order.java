package mentor.Restoran;

public class Order {

    public int orderCode;
    public Dish dish; //null
    public int numOfDish;
    public double orderPrice;
    public int numOfCafe;

    public Cafe cafe;

    public Order(Dish dish, int numOfDish) {
        this.dish = dish;
        this.numOfDish = numOfDish;
    }

    public Order(Cafe cafe, int numOfCafe) {
        this.cafe = cafe;
        this.numOfCafe = numOfCafe;
    }

    public void setOrderCode(int orderCode) {
        this.orderCode = orderCode;
    }


    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }
}
