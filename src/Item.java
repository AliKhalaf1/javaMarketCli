public class Item {
    private int id;
    private String name;
    private int stock;
    private int price;
    private int discount;

    public Item(int id, String name, int stock, int price, int discount) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.discount = discount;
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

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }
    public int getPriceAfterDiscount(){
        return price*(1-discount);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setStock(int stock) {
        if (stock<0){
            System.out.println("stock cant go in negative");
        }
        else{
            this.stock = stock;
        }
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
        if (num<=stock){
            return true;
        }
        else return false;
    }
    public void displayItemDetails(){
        System.out.println("ID: "+id+" Name: "+name+" Price: "+price+" Available: "+stock+" Discount: "+discount);
    }
}
