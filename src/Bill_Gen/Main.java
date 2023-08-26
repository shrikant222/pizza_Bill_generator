package Bill_Gen;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pizza veg = new Pizza(false);
        veg.addChees();
        veg.addToping();
        veg.takeAway();
        veg.bill();
        DeluxPizza dp = new DeluxPizza(true);
//       dp.takeAway();
        dp.bill();

    }
}
