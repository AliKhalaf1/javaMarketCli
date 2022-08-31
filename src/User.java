
import java.util.*;

public class User {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    private HashMap<Item,Integer> cart=new HashMap<>();


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addToCart(Item item,int countAddedToCart) {
        cart.putIfAbsent(item,0);
        int temp = cart.get(item)+countAddedToCart;
        cart.put(item,temp);
    }
    public void getUserDetail(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name+"\n Cart: ");
        for (Item key : cart.keySet()) {
            System.out.println(key.getName()+":"+cart.get(key));
        }

    }


}
