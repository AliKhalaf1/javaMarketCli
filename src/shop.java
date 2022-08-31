import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class shop {
    private String[] items = {"Item A", "Item B", "Item C", "Item D"};
    private User user = new User();
    Scanner in =new Scanner(System.in);

private void insertItem(){

    System.out.println("pick Item to insert into cart");
    for (int i = 0;i< items.length;i++){
        System.out.print(items[i]+" ");
    }
    String c = in.nextLine();
    System.out.println(c);
    user.addToCart(c);
    user.getCart();
}

public void mainShop(){
    int i =2;

    while (i!=0){
        System.out.println("pick 0 to exit");
        System.out.println("pick 1 to insert in cart");
        System.out.println("pick 2 to insert a group to cart");
        System.out.println("pick 3 to edit cart");
        System.out.println("pick 4 to show cart details");
        System.out.println("pick 5 to show price");
        i = in.nextInt();
        System.out.println(i);
        if (i ==1){
            String c = in.nextLine();
            user.addToCart(c);
        } else if (i==5) {
            user.getCart();
        }
    }
    }
}
