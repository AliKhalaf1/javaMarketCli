import java.util.ArrayList;
import java.util.Scanner;

public class shop {
    private int numberOfUsers=0;
    private int numberOfItems=0;

    private ArrayList <Item> itemsList= new ArrayList<>();
    private ArrayList <User> users= new ArrayList<>();
    Scanner in =new Scanner(System.in);

    private void addNewUser(String name){
        users.add(new User(numberOfUsers,name));
        numberOfUsers++;
    }
    private void addNewItem(String name,int stock,int price,int discount){
        itemsList.add(new Item(numberOfItems,name,stock,price,discount));
        numberOfItems++;
    }
    private void displayAllUsersDetails(){}
    private void displaySingleUserDetails(User user){
        user.getUserDetail();
    }
    private void insertOneItemIntoUserCart(User user,Item item){
        if (item.isEnoughInStock(1)){
            item.decrementStock();
            user.addToCart(item,1);
            System.out.println("Done");
        }
        else {
            System.out.println("Not enough in stock");
        }
    }

    private void insertSeveralItemsIntoCart(User user,Item item,int countOfItem){
        if (item.isEnoughInStock(countOfItem)){
            item.unitsTakenFromStock(countOfItem);
            user.addToCart(item,countOfItem);
            System.out.println("Done");

        }
        else {
            System.out.println("Not enough in stock");
        }
    }
    private void editCart(){

    }
    private void displayItems(){
        for (Item item:itemsList) {
            item.displayItemDetails();
        }
    }

    public void mainShop(){
        addNewItem("Product A",20,100,20);
        addNewItem("Product B",40,130,0);
        addNewItem("Product C",30,100,4);
        addNewItem("Product D",60,40,5);
        addNewUser("User 0");
        addNewUser("User 1");
        addNewUser("User 2");


        int i =4;
        while (i!=0){

            System.out.println("Which user");
            i = in.nextInt();
            while (i>=numberOfUsers){
                System.out.println("No user found try again");
                i = in.nextInt();
            }
            User currentUser = users.get(i);
            System.out.println("Hello "+currentUser.getName()+"\n\n");

            System.out.println("pick 0 to exit");
            System.out.println("pick 1 to insert in cart");
            System.out.println("pick 2 to insert a group to cart");
            System.out.println("pick 3 to edit cart");
            System.out.println("pick 4 to show your cart details");
            System.out.println("pick 5 to show price");
            i = in.nextInt();
            if (i ==1){
                System.out.println("Which product do you want to add to (pick id)");
                displayItems();
                i = in.nextInt();
                insertOneItemIntoUserCart(currentUser,itemsList.get(i));
            }else if (i==2) {
                System.out.println("Which product do you want to add to (pick id)");
                displayItems();
                i = in.nextInt();
                int productToBeAdded = i;
                System.out.println("How many units to be added");
                i = in.nextInt();
                insertSeveralItemsIntoCart(currentUser,itemsList.get(productToBeAdded),i);
            }else if (i==3) {

            }else if (i==4) {
               displaySingleUserDetails(currentUser);

            }else if (i==5) {

            }else {
                System.out.println(":/");
            }
        }
    }


}
