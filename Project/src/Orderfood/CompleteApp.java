
package Orderfood;

import java.util.Scanner;

/**
 *
 * @author Complete Application
 */
public class CompleteApp {
    public static void main(String[] args) {        
        MenuApp ma = new MenuApp();
        Scanner sc = new Scanner(System.in);
        String menuApp = "1.All Menu on Today\n"+
                         "2.Choose Your Order\n"+
                         "3.Your order\n"+
                         "4.Quit the app";
        do{            
            System.out.println("Welcome To 1716's Online ------------------------------");
            System.out.println(menuApp);
            System.out.println("-------------------------------------------------------");
            
            while(true){
            System.out.print("Please enter the number that you choose : ");
            int select = sc.nextInt();
                switch(select){
                    case 1 : ma.ifSelectOne(); break;
                    case 2 : ma.ifSelectTwo(); break;
                    case 3 : ma.ifSelectThree(); break;
                    case 4 : ma.ifSelectFour(); break;
                    default:
                }
                if(select >= 1 && select <= 4)
                break;
            }
     
        }while(ma.getStay() != 0);
        
    }
    
    
}
