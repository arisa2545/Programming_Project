
package Orderfood;

/** this class determine what information is to be collected in each selected step
 * 
 *
 * @author
 */
public class Food {
    private Type type;
    private String name;
    private double price;

    /**
     *
     * @param type
     * @param name
     * @param price
     */
    public Food(Type type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    /**
     *
     * @return type attribute 
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @return name attribute
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return price attribute
     */
    public double getPrice() {
        return price;
    }
    
    
}
