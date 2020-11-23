
package Orderfood;

public class OrderStorage {
    
    private Order[] yourOrder;
    private int head;

    
    
    /**
     *
     * @param  set the lenght of arrays
     * the lenght of arrays = amount of order that each person can order
     */
    public OrderStorage(int length){
        yourOrder = new Order[length];
    }

    /**
     *
     * @return head (the number of current order)
     */
    public int getHead(){
        return head;
    }
    
    /**
     *
     * @return length attribute
     */
    public int getLength(){
        return yourOrder.length;
    }
    
    /** add information to arrays and one order includes rice, curry, topping, drink
     * one order = one box in Arrays
     *
     * @param rice that user choose
     * @param curry that user choose
     * @param topping that user choose
     * @param drink that user choose
     */
    public void addToOrder(Food rice,Food curry,Food topping,Food drink){
        yourOrder[head++] = new Order(rice,curry,topping,drink);
    }
    
    /**
     *
     * @param i (what index in arrays)
     */
    public void showEachOrder(int i){
        System.out.println(yourOrder[i]);
    }
}
