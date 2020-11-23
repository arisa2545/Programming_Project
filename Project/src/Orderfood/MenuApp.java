package Orderfood;

import java.util.Scanner;

/**
 *
 * @author put Menu class and Order class together
 */
public class MenuApp {

    Select select = new Select();
    OrderStorage order = new OrderStorage(10);
    private double[] priceEachOrder = new double[10];
    private double totalPrice = 0;
    private int head;
    private int stay; // stay = check that you want to quit the app or stay in the app.

    /**
     *
     * @return return attribute stay
     */
    public int getStay() {
        return stay;
    }

    /** show all menu
     * 
     */
    public void ifSelectOne() {
        Scanner sc = new Scanner(System.in);
        int select;
        
        System.out.println("");
        System.out.println("Rice : ------------------------");
        Menu.showAllRice();
        System.out.println("");
        System.out.println("Curry : -------------------------");
        Menu.showAllCurry();
        System.out.println("");
        System.out.println("Topping : -----------------------");
        Menu.showAllTopping();
        System.out.println("");
        System.out.println("Drink : -------------------------");
        Menu.showAllDrink();
        System.out.println("");
        System.out.print("[back to home enter 1 / Quit the app enter another number] : ");
        select = sc.nextInt();
        if (select == 1) {
            stay = 1;
        } else {
            stay = 0;
        }
    }

    /** Select 4 step with scanner
     * in the last when confirm order method will add order to arrays and reset price(for calculate new price in the next order)
     * If the order If is completed, can not order more
     */
    public void ifSelectTwo() {
        Scanner sc = new Scanner(System.in);
        int isConfirm;
        
        if (order.getHead() < order.getLength()) {
            System.out.println("");
            System.out.println("Step 1 : Choose your rice ----------------------------------------");
            select.selectRice();
            System.out.println("");
            System.out.println("Step 2 : Choose your curry ---------------------------------------");
            select.selectCurry();
            System.out.println("");
            System.out.println("Step 3 : Choose your topping -------------------------------------");
            select.selectTopping();
            System.out.println("");
            System.out.println("Step 4 : Choose your drink ---------------------------------------");
            select.selectDrink();
            System.out.println("");
            System.out.println("Your Order : " + select.whatRice() + " + " + select.whatCurry() + " + " + select.whatTopping() + " + " + select.whatDrink());
            System.out.println("Price : " + select.priceEachOrder());
            System.out.print("[confirm your order enter 1 / cancel Enter another number] : ");
            isConfirm = sc.nextInt();
            if (isConfirm == 1) {
                order.addToOrder(select.getRice(), select.getCurry(), select.getTopping(), select.getDrink());
                priceEachOrder[head++] = select.priceEachOrder();
                this.totalPrice += select.priceEachOrder();
                this.stay = 1;
            } else {
                this.stay = 1;
            }
        } else {
            System.out.println("---------------* Can not order more. Your order is already 10 *----------------------");
            System.out.println("");
        }
    }


    /** show all order that you already ordered
     * 
     */
    public void ifSelectThree(){
        Scanner sc = new Scanner(System.in);
        int select;
        
        System.out.println("");
        for(int i = 0; i < head; i++){
            this.order.showEachOrder(i);
            System.out.print("Price : ");
            System.out.println(priceEachOrder[i] + "\n");
            
        }
        System.out.println("\nTotal Price : " + this.totalPrice);
        System.out.print("[back to home enter 1 / Quit the app enter another number] : ");
        select = sc.nextInt();
        if (select == 1) {
            stay = 1;
        } else {
            stay = 0;
        }
        
    }
    
    /** Quit the app
     *
     */
    public void ifSelectFour() {
        stay = 0;
    }

}
