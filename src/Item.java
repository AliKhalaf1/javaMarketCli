public class Item {
    private final int id;
    private final String name;
    private int stock;
    private final int price;
    private final int discount;

    public Item(int id, String name, int stock, int price, int discount) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
    }
    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }
    public int getPriceAfterDiscount(){
        return price*(100-discount)/100;
    }


    public int getDiscount() {
        return discount;
    }


    public void addToStock(int addedUnits) {
        stock=stock+addedUnits;
    }
    public void decrementStock(){
        stock--;
    }
    public void unitsTakenFromStock(int unitsTaken){
        if (unitsTaken>stock){
            System.out.println("Not enough in stock");
        }
        else {
        stock=stock-unitsTaken;
        }
    }
    public boolean isEnoughInStock(int num){
        return num <= stock;
    }
    public void displayItemDetails(){
        System.out.println("ID: "+id+" Name: "+name+" Price: "+price+" Available: "+stock+" Discount: "+discount);
    }
}
