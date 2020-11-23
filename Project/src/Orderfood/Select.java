
package Orderfood;

import java.util.Arrays;
import java.util.Scanner;


public class Select {
    
    private Food rice;
    private Food curry;
    private Food topping;
    private Food drink;

    public Food getRice() {
        return rice;
    }

    public Food getCurry() {
        return curry;
    }

    public Food getTopping() {
        return topping;
    }

    public Food getDrink() {
        return drink;
    }
    

// Select 4 step ---------------------------------------------------------------------------------------------------------------
// Keep the value of the rice, curry, topping, drink that you have selected in the app and calculate price.    

    /** get number from user and keep the information of the rice that datatype name Food 
     *
     */
    public void selectRice(){
        Menu.showAllRice();
        while(true){
            Scanner ss = new Scanner(System.in);
            System.out.print("Please choose the number of rice : ");
            int select = ss.nextInt();
            switch(select){
                case 1 : rice = new Food(Type.Rice , "Thai jasmine rice" , 10);
                         break;
                         
                case 2 : rice = new Food(Type.Rice , "brown rice" , 15);
                         break;
                         
                case 3 : rice = new Food(Type.Rice , "Riceberry" , 15);
                         break;
                         
                case 4 : rice = new Food(Type.Rice , "Soft-boiled rice" , 10);
                         break;
                         
                case 5 : rice = new Food(Type.Rice , "glutinous rice" , 10);
                         break;
                         
                case 0 : rice = new Food(Type.Rice , "No rice" , 0);
                         break;
                         
                default: break;                   
            }
            if(select >= 0 && select <= 5)
                break;
        }
        System.out.println("Your rice : " + rice.getName());        
    }
    
    /** get number from user and keep the information of the curry that datatype name Food
     *
     */
    public void selectCurry(){
        Menu.showAllCurry();
        while(true){
            Scanner ss = new Scanner(System.in);
            System.out.print("Please choose the number of curry : ");
            int select = ss.nextInt();
            switch(select){
                case 1 : curry = new Food(Type.Curry , "Sour soup made of Tamarind Paste" , 30);
                         break;
                         
                case 2 : curry = new Food(Type.Curry , "Steamed duck" , 40);
                         break;
                         
                case 3 : curry = new Food(Type.Curry , "Green curry chicken  in coconut milk" , 30);
                         break;
                         
                case 4 : curry = new Food(Type.Curry , "Massa man Curry" , 30);
                         break;
                         
                case 5 : curry = new Food(Type.Curry , "Minced pork and soya bean curd soup" , 30);
                         break;
                         
                case 6 : curry = new Food(Type.Curry , "Tom Yum Kung Sour prawn soup" , 40);
                         break;
                         
                case 0 : curry = new Food(Type.Curry , "No curry" , 0);
                         break;
                         
                default: break;                   
            }
            if(select >= 0 && select <= 6)
                break;
        }
        System.out.println("Your curry : " + curry.getName());        
    }
    
    /** get number from user and keep the information of the topping that datatype name Food
     *
     */
    public void selectTopping(){
        Menu.showAllTopping();
        while(true){
            Scanner ss = new Scanner(System.in);
            System.out.print("Please choose the number of topping : ");
            int select = ss.nextInt();
            switch(select){
                case 1 : topping = new Food(Type.Topping , "Omelette" , 5);
                         break;
                         
                case 2 : topping = new Food(Type.Topping , "Fried egg" , 5);
                         break;
                         
                case 3 : topping = new Food(Type.Topping , "boiled egg" , 5);
                         break;
                         
                case 4 : topping = new Food(Type.Topping , "Sausage" , 10);
                         break;
                         
                case 5 : topping = new Food(Type.Topping , "Fried chicken" , 15);
                         break;
                         
                case 6 : topping = new Food(Type.Topping , "Grilled chicken" , 15);
                         break;
                         
                case 0 : topping = new Food(Type.Topping , "No topping" , 0);
                         break;
                         
                default: break;                   
            }
            if(select >= 0 && select <= 6)
                break;
        }
        System.out.println("Your topping : " + topping.getName());        
    }
    
    /**get number from user and keep the information of the drink that datatype name Food
     *
     */
    public void selectDrink(){
        Menu.showAllDrink();
        while(true){
            Scanner ss = new Scanner(System.in);
            System.out.print("Please choose the number of drink : ");
            int select = ss.nextInt();
            switch(select){
                case 1 : drink = new Food(Type.Drink , "Milk tea" , 25);
                         break;
                         
                case 2 : drink = new Food(Type.Drink , "Cocoa" , 25);
                         break;
                         
                case 3 : drink = new Food(Type.Drink , "Milkshake" , 25);
                         break;
                         
                case 4 : drink = new Food(Type.Drink , "Green tea" , 25);
                         break;
                         
                case 5 : drink = new Food(Type.Drink ,"Fresh water"  , 15);
                         break;
                         
                case 6 : drink = new Food(Type.Drink , "Coke" , 20);
                         break;
                         
                case 0 : drink = new Food(Type.Drink , "No drink" , 0);
                         break;
                         
                default: break;                   
            }
            if(select >= 0 && select <= 6)
                break;
        }
        System.out.println("Your drink : " + drink.getName());        
    }
//-------------------------------------------------------------------------------------------------------------------------------
    
    /** 
     *
     * @return the rice that user choose 
     */
    public String whatRice() {
        return rice.getName();
    }

    /**
     *
     * @return curry that user choose
     */
    public String whatCurry() {
        return curry.getName();
    }

    /**
     *
     * @return topping that user choose
     */
    public String whatTopping() {
        return topping.getName();
    }

    /**
     *
     * @return drink that user choose
     */
    public String whatDrink() {
        return drink.getName();
    }
    
    /**
     *
     * @return calculate price of order
     */
    public double priceEachOrder(){
        double price = rice.getPrice() + curry.getPrice() + topping.getPrice() + drink.getPrice();
        return price;
    }
    
    
          
}
