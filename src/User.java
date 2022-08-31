
import java.util.*;

public class User {
    private int id;
    private String name;
    private HashMap<Item,Integer> cart=new HashMap<>();


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addToCart(Item item,int countAddedToCart) {
        cart.putIfAbsent(item,0);
        int unitsInCart = cart.get(item)+countAddedToCart;
        cart.put(item,unitsInCart);
    }
    public void getUserDetail(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name+"\n Cart: ");
        for (Item key : cart.keySet()) {
            System.out.println(key.getName()+":"+cart.get(key));
        }

    }
    public int getItemCount(Item item){
        return cart.getOrDefault(item, 0);
    }
    public void removeFromCart(Item item,int numberOfUnitsRemoved){
        int unitsInCart = cart.get(item)-numberOfUnitsRemoved;
        cart.put(item,unitsInCart);
    }
    public void displayTotalCartPrice(){
        int totalPrice=0;
        int price;
        for (Item key : cart.keySet()) {
            price=cart.get(key)* key.getPriceAfterDiscount();
            totalPrice=totalPrice+price;
            System.out.println(cart.get(key)+" of "+key.getName()+" that costs "+ key.getPrice()+" with a discount of "+ key.getDiscount()+"% is "+price);
        }
        System.out.println("total price is: "+totalPrice);
    }


}
