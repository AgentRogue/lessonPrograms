package progX;
//OH MY GOD


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by TJ Challstrom on 29-Jun-15.
 * Main Class
 */
public class ProgX {
    public static void main(String[] args) {
        Dish dish1 = new Dish("Ice Cream", "Creamy", 0, 'B');
        Dish dish2 = new Dish("Sushi", "Fishy", 2, 'A');
        //Rating goes down
        dish1.setRating('C');
        if (dish1.getSpicy() > 4) {
            System.out.println("SPICY!");
        } else {
            System.out.println("Not Spicy");
        }
        System.out.println(dish1);
        Food food = new Food();
        dish1.setFood(food);
        food.setPrice(4.24);
        food.setQuality(3);
        food.setSize("Small");
        System.out.println(dish1);
    }
}

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
