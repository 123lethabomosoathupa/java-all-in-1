/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package getinteger2;

/**
 *
 * @author letha
 */
import java.util.*;                                             //Contains the classes required to build an applet as well as the classes that an applet uses to interact with its applet context.

public class GetInteger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i = GetAnInteger();
        System.out.println("You entered " + i);
    }

    public static int GetAnInteger() {
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("That's not "
                    + "an integer. Try again: ");
        }
        return sc.nextInt();
    }
}
