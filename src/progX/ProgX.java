package progX;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by TJ Challstrom on 29-Jun-15.
 * Main Class
 */
//main() method
public class ProgX {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Bowl", "Creamy Cream", 'B', 0.00);
        //Rating goes down
        dish1.setRating('C');
        //Let's see if it's spicy
        if (dish1.getSpicy() > 4) {
            System.out.println("SPICY!");
        } else {
            System.out.println("Not Spicy");
        }
        //Let's see how we're doing
        System.out.println(dish1);
        //Let's put some food on the dish
        Food food = new Food("Medium", 4, "Sweet", 1);
        dish1.setFood(food);
        //Let's make the dish cost 4.24$
        dish1.setPrice(4.24);
        //Let's make the portion smaller
        food.setQuality(3);
        food.setSize("Small");
        //Let's see what we got
        System.out.println(dish1);
    }
}
//Helper Class
class ConsoleHandler {
    private static Scanner scanner = new Scanner(System.in); //Helpful attribute for classes like this!

    protected static char getChar(String message) { //New!
        System.out.printf(message); //New!
        return scanner.nextLine().charAt(0);
    }

    protected static int getInt(String message) {
        int out = 0;
        boolean valid = false;
        while (!valid) {
            System.out.printf(message);
            try {
                out = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.err.println("No number entered!");
            } finally {
                scanner.nextLine();
            }
        }
        return out;
    }

    protected static String getString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
