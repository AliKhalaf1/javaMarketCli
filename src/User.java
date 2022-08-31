import javafx.util.Pair;

import java.util.HashMap;
import java.util.Vector;

public class User {
    private HashMap<String,Integer> cart=new HashMap<>();


    public void addToCart(String item) {
        cart.putIfAbsent(item,0);
            int temp = cart.get(item)+1;
            cart.put(item,temp);
    }
    public void getCart(){
        System.out.println(cart);
    }
}
