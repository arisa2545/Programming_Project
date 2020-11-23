
package Orderfood;

//Information of Arrays --------------------------------------------------------------------------------------

/**
 *
 * @author Information of Arrays
 */
public class Order {
    private Food rice;
    private Food curry;
    private Food topping;
    private Food drink;

    public Order(Food rice, Food curry, Food topping, Food drink) {
        this.rice = rice;
        this.curry = curry;
        this.topping = topping;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Set : " + rice.getName() + "[" + rice.getPrice() + "]" 
                + " + " + curry.getName() + "[" + curry.getPrice() + "]"
                + " + " + topping.getName() + "[" + topping.getPrice() + "]"
                + " + " + drink.getName() + "[" + drink.getPrice();
                
    }
        
}
