package preX;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by TJ Challstrom on 25-Jun-15.
 *  Try/Catch
 */
public class prog9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
        }
        if (number == 0) throw new InputMismatchException("Non number entered!");

        System.out.println(number);
    }
}
